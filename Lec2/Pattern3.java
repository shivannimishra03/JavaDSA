package Lec2;

public class Pattern3 {
    public static void main(String[]args){
        int n = 5;
        int row = 1;
        int star = n;
    
        while(row <= n){
            //star
            int j = 1;
            while( j <= star){
                System.out.print("* ");
                j++;
            }
            //next row prep
            row++;
            star--;
            System.out.println();
        }
    }
    
}
