package day01;

import org.junit.Test;

/**
 * Created by yahto on 31/05/2017.
 */
public class Different {
    public boolean checkDifferent(String iniString) {
        char[] arr = iniString.toCharArray();
        char[] table = new char[128];
        for (int i = 0; i < arr.length; i++) {
            table[arr[i]]++;
        }
        boolean flag = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i] >= 2) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    @Test
    public void test(){
        System.out.println(checkDifferent("acbdbesy"));
    }
}
