package day05;

import org.junit.Test;

/**
 * Created by yahto on 11/07/2017.
 */
public class LeftRotateStringSolution {
    public String LeftRotateString(String str, int n) {
        if (n <= 0 || n > str.length()) {
            return str;
        }
        StringBuffer doubleStr = new StringBuffer(str + str);
        return doubleStr.substring(n, n + str.length());
    }

    @Test
    public void test() {
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }
}
