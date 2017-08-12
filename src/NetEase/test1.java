package NetEase;

import java.util.Scanner;

/**
 * Created by yahto on 12/08/2017.
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");
            if (strings.length != 4){
                break;
            }
            int[] data = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                data[i] = Integer.parseInt(strings[i]);
            }
            System.out.println(getDays(data[0], data[1], data[2], data[3]));
        }
        scanner.close();
    }

    private static int getDays(int x, int f, int d, int p) {
        int days = f;
        d = d - (x * f);
        days = days + d / (x + p);
        return days;
    }
}
