package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yahto on 31/05/2017.
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
        String[] arrA = stringA.split(" ");
        String[] arrB = stringA.split(" ");
        List<String> listA = new ArrayList<String>();
        for (int i = 0; i < arrA.length; i++) {
            listA.add(arrA[i]);
        }
        List<String> listB = new ArrayList<String>();
        for (int i = 0; i < arrB.length; i++) {
            listB.add(arrB[i]);
        }
        boolean flag = true;
        for (String strA : listA) {
            if (!listB.contains(strA)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
