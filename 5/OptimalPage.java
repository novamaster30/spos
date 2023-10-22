import java.util.*;

public class OptimalPage {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter number of Frames: ");
        int numberOfFrames = sn.nextInt();
        int frame[] = new int[numberOfFrames];

        System.out.print("Enter number of Pages: ");
        int numberOfPages = sn.nextInt();

        int pages[] = new int[numberOfPages];

        System.out.print("Enter the pages: ");
        for (int i = 0; i < numberOfPages; i++)
            pages[i] = sn.nextInt();

        int faults = 0;
        int hit = 0;

        for (int i = 0; i < numberOfFrames; i++){
            frame[i] = -1;
        }

        for (int i = 0; i < numberOfPages; i++) {
            boolean pageFound = false;

            for (int j = 0; j < numberOfFrames; j++) {
                if (frame[j] == pages[i]) {
                    pageFound = true;
                    hit++;
                    break;
                }
            }

            if (!pageFound) {
                int maxDistance = -1;
                int replaceIndex = -1;

                for (int j = 0; j < numberOfFrames; j++) {
                    int nextOccurrence = -1;

                    for (int k = i + 1; k < numberOfPages; k++) {
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
