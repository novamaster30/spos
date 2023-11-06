import java.util.*;

public class OptimalPage {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter number of Frames: ");
        int fr = sn.nextInt();
        int frame[] = new int[fr];

        System.out.print("Enter number of Pages: ");
        int pg = sn.nextInt();

        int pages[] = new int[pg];

        System.out.print("Enter the pages: ");
        for (int i = 0; i < pg; i++)
            pages[i] = sn.nextInt();

        int faults = 0;
        int hit = 0;

        for (int i = 0; i < fr; i++){
            frame[i] = -1;
        }

        for (int i = 0; i < pg; i++) {
            boolean check = false;

            for (int j = 0; j < fr; j++) {
                if (frame[j] == pages[i]) {
                    check = true;
                    hit++;
                    break;
                }
            }

            if (!check) {
                int maxDistance = -1;
                int replaceIndex = -1;

                for (int j = 0; j < fr; j++) {
                    int nextOccurrence = -1;

                    for (int k = i + 1; k < pg; k++) {
                        if (frame[j] == pages[k]) {
                            nextOccurrence = k;
                            break;
                        }
                    }

                    if (nextOccurrence == -1) {
                        replaceIndex = j;
                        break;
                    }

                    if (nextOccurrence > maxDistance) {
                        maxDistance = nextOccurrence;
                        replaceIndex = j;
                    }
                }

                frame[replaceIndex] = pages[i];
                faults++;
            }
        }

        System.out.println("\nTotal Page Faults: " + faults);
        System.out.println("Total Page Hits: " + hit);
    }
}
