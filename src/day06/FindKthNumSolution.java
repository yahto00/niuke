package day06;

import org.junit.Test;

/**
 * Created by yahto on 12/07/2017.
 */
public class FindKthNumSolution {
    public int findKthNum(int[] arr1, int[] arr2, int kth) {
        int[] newArr = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (arr1Index <= arr1.length - 1 && arr2Index <= arr2.length - 1) {
                if (arr1[arr1Index] <= arr2[arr2Index]) {
                    newArr[i] = arr1[arr1Index];
                    arr1Index++;
                    continue;
                } else {
                    newArr[i] = arr2[arr2Index];
                    arr2Index++;
                    continue;
                }
            }
            if (arr1Index > arr1.length - 1) {
                newArr[i] = arr2[arr2Index];
                arr2Index++;
                continue;
            }
            if (arr2Index > arr2.length - 1 ) {
                newArr[i] = arr1[arr1Index];
                arr1Index++;
                continue;
            }
        }
        return newArr[kth - 1];
    }

    @Test
    public void test() {
        int[] arr1 = {4,5,7,8,13,15,17,18};
        int[] arr2 = {7,8};
        System.out.println(findKthNum(arr1, arr2, 8));
    }
}
