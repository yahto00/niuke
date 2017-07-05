package meituan;

import java.util.Scanner;

/**
 * Created by yahto on 05/07/2017.
 */
public class Monopoly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            getAllMethod(number);
        }
        scanner.close();
    }

    public static void getAllMethod(int number) {
        System.out.println(number);
        for (int i = 1, j = number - 1; i <= j;) {
            if ((i + j) == number) {
                System.out.print(i);
                System.out.print(j);
                System.out.println();
                i++;
                j--;
            } else if ((i + j) < number) {
                i++;
            } else {
                j--;
            }
        }
    }
}
