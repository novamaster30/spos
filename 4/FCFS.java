import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = sn.nextInt();

        int[] arrival = new int[n];
        int[] burst = new int[n];
        int[] completion = new int[n];
        int[] TAT = new int[n];
        int[] WT = new int[n];
        float AVGTAT = 0, AVGWT = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Arrival Time for Process " + (i + 1) + ": ");
            arrival[i] = sn.nextInt();

            System.out.print("Enter Burst Time for Process " + (i + 1) + ": ");
            burst[i] = sn.nextInt();
        }

        completion[0] = arrival[0] + burst[0];
        for (int i = 1; i < n; i++) {
            completion[i] = Math.max(arrival[i], completion[i - 1]) + burst[i];
        }

        System.out.println("\nProcess\tArrival\tBurst\tCompletion\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            TAT[i] = completion[i] - arrival[i];
            AVGTAT += TAT[i];

            WT[i] = TAT[i] - burst[i];
            AVGWT += WT[i];

            System.out.println((i + 1) + "\t" + arrival[i] + "\t" + burst[i] + "\t" + completion[i] + "\t\t" + WT[i] + "\t" + TAT[i]);
        }

        System.out.println("\nAverage Turnaround Time: " + (AVGTAT / n));
        System.out.println("Average Waiting Time: " + (AVGWT / n));
    }
}
