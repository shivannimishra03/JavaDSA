package Lec2;
import java.util.*;

public class Pattern10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;
        int row = 1;
        while( row <= n){
            // space
            int i = 1;
            while( i <= space){
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while ( j <= star){
                System.out.print("* ");
                j++;
            }
            //next row prep
            row++;
            star-=2;
            space++;
            System.out.println();
        }

    }
    
}
