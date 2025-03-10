package Lec10;

public class Insertion_sort_3 {
    public static void main(String[] args) {
        int [] arr = {1,8,2,7,9,11,-8};
        Sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            InsertLastElement(arr,i);
        }
    }
    public static void InsertLastElement(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr [j];
            j--;
        }
        arr[j+1] = item;
    }
}
