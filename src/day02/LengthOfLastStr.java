package day02;

import java.util.Scanner;

/**
 * Created by yahto on 05/06/2017.
 */
public class LengthOfLastStr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        String lastStr = arr[arr.length - 1];
        System.out.print(lastStr.length());
    }
}
