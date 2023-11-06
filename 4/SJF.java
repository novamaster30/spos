import java.util.Scanner;

public class SJF {
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		
		System.out.print("Enter Number of process You Want");
		int n=sn.nextInt();
		
		int process[]=new int[n];
		int arrival[]=new int[n];
		int brust[]=new int[n];
		int completion[]=new int[n];
		int TAT[]=new int[n];
		int WT[]=new int[n];
		
		int oribrust[]=new int[n];
		int flag[]=new int[n];
		
		float AvgTAT=0,AvgWT=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Process "+(i+1)+" Arrival Time :");
			arrival[i]=sn.nextInt();
			
			System.out.print("Enter Process "+(i+1)+" Brust Time :");
			brust[i]=sn.nextInt();
			
			oribrust[i]=brust[i];
			
			flag[i]=0;
			process[i]=i+1;
		}
		int tot=0;
		int st=0;
		
		while(true)
		{
			int max=99;
			int c=n;

			if(tot==n)
			{
				break;
			}
			
			for(int i=0;i<n;i++)
			{
				if(arrival[i]<=st && flag[i]==0 && brust[i]<max)
				{
					max=brust[i];
					c=i;
				}
				
			}
			
			if(c==n)
			{
				st++;
			}
			else
			{
				brust[c]--;
				st++;
				if(brust[c]==0)
				{
					tot++;
					completion[c]=st;
					flag[c]=1;
				}
			}
		}
		
		System.out.print("\nProcess\t\tArrival\t\tBrust\tCompletion\t\tWT\tTAT");
		for(int i=0;i<n;i++)
		{
			TAT[i]=completion[i]-arrival[i];
			AvgTAT=AvgTAT+TAT[i];
			
			WT[i]=TAT[i]-oribrust[i];
			AvgWT=AvgWT+WT[i];
			
			System.out.print("\n"+process[i]+"\t\t"+arrival[i]+"\t\t"+oribrust[i]+"\t\t"+completion[i]+"\t\t"+WT[i]+"\t\t"+TAT[i]);
		}
		
		System.out.print("\n\nAverge AvgWT Time :"+(AvgWT/n));
		System.out.print("\nAverge Turn Around Time :"+(AvgTAT/n));
	}
}
