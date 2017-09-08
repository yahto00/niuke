package day07;

import org.junit.Test;

/**
 * Created by yahto on 06/09/2017.
 * 输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 */
public class NumberOf1Solution {
    public int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(NumberOf1(-2147483648));
    }
}
