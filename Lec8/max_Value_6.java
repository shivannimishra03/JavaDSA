package Lec8;

public class max_Value_6 {
    public static void main(String[] args) {
        int [] arr = {3,5,1,7,8,6};
        System.out.println(Max(arr));
    }
    public static int Max(int[] arr){
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m){
                m = arr[i];
            }
        }
        return m;
    }
}
