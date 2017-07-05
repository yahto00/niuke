package day02;

import java.util.*;

/**
 * Created by yahto on 05/06/2017.
 */
public class SortNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Set<Integer> set = new HashSet<Integer>();
            set.add(scanner.nextInt());
            List<Integer> list = new ArrayList<Integer>();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()){
                list.add((Integer) iterator.next());
            }
            Collections.sort(list);
            for (Integer num :
                    list) {
                System.out.println(num);
            }
        }

    }
}
