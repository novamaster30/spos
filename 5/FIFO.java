import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Frame Size: ");
        int fr = sn.nextInt();
        int frame[] = new int[fr];

        for (int i = 0; i < fr; i++) {
            frame[i] = -1;
        }

        System.out.print("Enter Number of Pages: ");
        int pg = sn.nextInt();
        int pages[] = new int[pg];

        System.out.print("Enter Pages: ");
        for (int i = 0; i < pg; i++) {
            pages[i] = sn.nextInt();
        }

        int hits = 0;
        int faults = 0;
        int j = 0;

        for (int i = 0; i < pg; i++) {
            boolean check = false;

            for (int k = 0; k < fr; k++)
            
                if (frame[k] == pages[i]) {
                    check = true;
                    hits++;
                }

                if (!check) {
                    frame[j] = pages[i];
                    j = (j + 1) % fr;
                    faults++;
                }
        }

        System.out.println("Hits: " + hits);
        System.out.println("Faults: " + faults);
    }
}
