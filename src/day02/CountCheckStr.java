package day02;

import java.util.Scanner;

/**
 * Created by yahto on 05/06/2017.
 */
public class CountCheckStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        String checkStr = scanner.nextLine().toUpperCase();
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (checkStr.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        System.out.print(count);
    }
}
