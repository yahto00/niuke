package day03;

/**
 * Created by yahto on 16/06/2017.
 */
public class FindSolution {
    public static boolean Find(int target, int [][] array) {
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j < array[0].length){
            if(i == -1 || j == array[0].length){
                return false;
            }
            if(target < array[i][j]){
                i --;
            }
            if(i == -1 || j == array[0].length){
                return false;
            }
            if(target > array[i][j]){
                j ++;
            }
            if(i == -1 || j == array[0].length){
                return false;
            }
            if(target == array[i][j]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(5,arr));
    }
}
