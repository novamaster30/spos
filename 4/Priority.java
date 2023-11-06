import java.util.Scanner;

public class Priority {
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter No of processes :");
		int n=sn.nextInt();
		
		int process[]=new int[n];
		int priority[]=new int[n];
		int arrival[]=new int[n];
		int burst[]=new int[n];
		int completion[]=new int[n];
		int WT[]=new int[n];
		int TAT[]=new int[n];
		float AvgTAT=0,AvgWT=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Process "+(i+1)+"burst Time :");
			burst[i]=sn.nextInt();
			
			System.out.print("Enter Process "+(i+1)+"Priority  :");
			priority[i]=sn.nextInt();
			
			process[i]=i+1;
			arrival[i]=0;
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(priority[i]>priority[j])
				{
					int temp=priority[i];
					priority[i]=priority[j];
					priority[j]=temp;
					
					temp=process[i];
					process[i]=process[j];
					process[j]=temp;
					
					temp=burst[i];
					burst[i]=burst[j];
					burst[j]=temp;

					
				}
			}
			
		}
			
        completion[0] = arrival[0] + burst[0];
        for (int i = 1; i < n; i++) {
            completion[i] = Math.max(arrival[i], completion[i - 1]) + burst[i];
        }

			
			System.out.print("\n\nPriority \tProcess \tbursttime \tCompletion \tWT \t\tTAT");
			for(int i=0;i<n;i++)
			{
				TAT[i]=completion[i]-arrival[i];
				AvgTAT+=TAT[i];
				
				WT[i]=TAT[i]-burst[i];
				AvgWT+=WT[i];
				
				System.out.print("\n"+priority[i]+"\t\t"+process[i]+"\t\t"+burst[i]+"\t\t"+completion[i]+"\t\t"+WT[i]+"\t\t"+TAT[i]);
			}
			System.out.print("\n\nAvergae Turn Around Time :"+(AvgTAT/n));
			System.out.print("\nAvergae Wait Time :"+(AvgWT/n));
			
			
		}
	}
