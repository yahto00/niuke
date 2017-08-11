package haoweilai;

import java.util.Scanner;

/**
 * Created by yahto on 01/08/2017.
 * 好未来笔试第三题
 */
public class test3 {
    final static int MAX_LENGTH_INSERT_SORT = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Integer hNum = Integer.parseInt(scanner.nextLine());
            String[] hData = scanner.nextLine().split(" ");
            int[] hArr = new int[hNum];
            for (int i = 0; i < hNum; i++) {
                hArr[i] = Integer.parseInt(hData[i]);
            }
            Integer wNum = Integer.parseInt(scanner.nextLine());
            String[] wData = scanner.nextLine().split(" ");
            int[] wArr = new int[wNum];
            for (int i = 0; i < wNum; i++) {
                wArr[i] = Integer.parseInt(wData[i]);
            }
            countPerson(hArr, wArr);
        }
        scanner.close();
    }

    private static void countPerson(int[] hArr, int[] wArr) {
        int count = 0;
        QuickSort(hArr);
        QuickSort(wArr);
        for (int i = hArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < wArr.length; j++) {
                if (hArr[i] <= wArr[j]) {
                    count++;
                    wArr[j] = 0;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static void QuickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    //对顺序表子序列作快速排序     待排序序列的最小下标值low和最大下标值high
    public static void sort(int[] arr, int low, int high) {
        int pivot;
        if ((high - low) > MAX_LENGTH_INSERT_SORT) {
            while (low < high) {
                pivot = Partition(arr, low, high);//将数组子序列一分为二
                sort(arr, low, pivot - 1);//对低子表递归排序
                /////////////////////////////////////////////////////
                //QSort(arr, pivot+1, high);//对高子表递归排序
                low = pivot + 1;
            }
        } else {
            insertSort(arr);
        }
    }

    //选择一个关键字，想尽办法将它放到一个位置，使得它左边的值都比它小，
    //右边的值都比它大，我们称这个关键字叫枢轴。
    public static int Partition(int[] arr, int low, int high) {

        if (arr == null || low < 0 || high >= arr.length) {
            new Exception();
        }

        int pivotkey;
        pivotkey = arr[low];//选取第一个记录作枢轴记录

        int tempCopy = pivotkey;//将枢轴值备份到tempCopy中

        while (low < high)//从表的两端向中间扫描
        {
            while (low < high && arr[high] >= pivotkey) {//如果大于枢轴值，则下标减一，否则，跳出循环。
                high--;
            }
            arr[low] = arr[high];//采用替换而不是交换的方式进行操作
            while (low < high && arr[low] < pivotkey) {//如果小于枢轴值，则下标加一，否则，跳出循环。
                low++;
            }
            arr[high] = arr[low];//采用替换而不是交换的方式进行操作
        }
        arr[low] = tempCopy;//将枢轴值替换回arr[low]
        return low;//返回枢轴值所在位置
    }


    public static void insertSort(int[] arr) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }
}
