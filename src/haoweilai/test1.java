package haoweilai;

import java.util.Scanner;

/**
 * Created by yahto on 01/08/2017.
 * 好未来笔试第一题
 */
public class test1 {
    final static int MAX_LENGTH_INSERT_SORT = 7;

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
            //Swap(arr, low, high);//交换
            arr[low] = arr[high];//采用替换而不是交换的方式进行操作
            while (low < high && arr[low] < pivotkey) {//如果小于枢轴值，则下标加一，否则，跳出循环。
                low++;
            }
            //Swap(arr, low, high);//交换
            arr[high] = arr[low];//采用替换而不是交换的方式进行操作
        }
        arr[low] = tempCopy;//将枢轴值替换回arr[low]
        return low;//返回枢轴值所在位置
    }

    public static void Swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number < 3) {
                System.out.println(0);
            } else {
                String[] data = scanner.nextLine().split(" ");
                int[] arr = new int[number];
                for (int i = 0; i < number; i++) {
                    arr[i] = Integer.parseInt(data[i]);
                }
                QuickSort(arr);
                int num1, num2;
                if (arr[0] != 0) {
                    num1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
                    num2 = arr[0] * arr[1] * arr[arr.length - 1];
                    if (num1 >= num2) {
                        System.out.println(num1);
                    } else {
                        System.out.println(num2);
                    }
                } else {
                    System.out.println(arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]);
                }
            }
        }
        scanner.close();
    }
}
