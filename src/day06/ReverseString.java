package day06;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by yahto on 12/07/2017.
 */
public class ReverseString {
    public String reverseString(String str) {
        if (str == null || str.length() == 0){
            return str;
        }
        char[] arr = str.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i <= (arr.length - 1) / 2; i++, j--) {
            if (i >= j) {
                break;
            }
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return String.valueOf(arr);
    }

    @Test
    public void test() {
        System.out.println(reverseString("abcdef"));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(reverseString(scanner.nextLine()));
        }
        scanner.close();
    }
}
