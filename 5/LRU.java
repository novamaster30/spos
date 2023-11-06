import java.util.ArrayList;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Number of frames: ");
        int fr = sn.nextInt();

        System.out.print("Enter Number of Pages: ");
        int pg = sn.nextInt();

        System.out.print("Enter Pages: ");
        ArrayList<Integer> s = new ArrayList<>(fr);
        int fault = 0;
        int hit = 0;

        for (int i = 0; i < pg; i++) {
            int page = sn.nextInt();
            if (!s.contains(page)) {
                if (s.size() == fr) {
                    s.remove(0);
                }
                s.add(page);
                fault++;
            }
			else {
                s.remove(Integer.valueOf(page));
                s.add(page);
                hit++;

            }
        }
        System.out.println("Page Fault: " + fault);
        System.out.println("Page Hit: " + hit);
    }
}
