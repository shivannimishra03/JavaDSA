package Lec8;

public class Basic {
    public static void main(String[] args) {
        int a ;
        int [] arr = new int[5];
        System.out.println(arr);
        int [] other = arr;
        System.out.println(other);
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 8;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // checking size of array
        System.out.println(other.length);
    }
    
}
