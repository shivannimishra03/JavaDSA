package Lec2;
import java.util.*;;
public class Pattern24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row <= n){
            //space
            int i = 1;
            while ( i <= space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while ( j<= star){
                System.out.print( " " +row  );
                j++;
            }
             //next row prep
            row++;
            space--;
            star+=2;
            System.out.println();
    } 
    
}
}