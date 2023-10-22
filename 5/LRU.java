import java.util.ArrayList;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Number of Frames: ");
        int frame = sn.nextInt();

        System.out.print("Enter Number of Pages: ");
        int pg = sn.nextInt();

        System.out.print("Enter Pages: ");
        ArrayList<Integer> s = new ArrayList<>(frame);
        int pageFault = 0;

        for (int i = 0; i < pg; i++) {
            int page = sn.nextInt();
            if (!s.contains(page)) {
                if (s.size() == frame) {
                    s.remove(0);
                }
                s.add(page);
                pageFault++;
            }
			else {
                s.remove(Integer.valueOf(page));
                s.add(page);
            }
        }
        System.out.println("Page Fault: " + pageFault);
        System.out.println("Page Hit: " + (pageFault-pg));
    }
}
