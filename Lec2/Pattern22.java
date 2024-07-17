package Lec2;
import java.util.*;;
public class Pattern22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = -1;
        int row = 1;
        while ( row <= n){
            //star
            int i = 1;
            while( i <= star){
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while( j <= space){
                System.out.print("  ");
                j++;
            }
            //star
            int k = 1;
            if ( row == 1){
                k = 2;
            }
            while ( k <= star){
                System.out.print("* ");
                k++;
            }
            //next row prep
            row++;
            star--;
            space+=2;
            System.out.println();
        }

    }
    
}
