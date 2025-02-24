package Lec10;

import javax.sql.rowset.spi.SyncResolver;

public class Maximun_Subarray_4 {
    // Leet code question of Serial number 53
    public static void main(String[]args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(MaxSum(arr));
    }
    
public static int MaxSum(int[] arr){
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = i; j < arr.length; j++) {
            sum = sum + arr[j];
            ans = Math.max(ans,sum);
        }
    }
    return ans;
}

}