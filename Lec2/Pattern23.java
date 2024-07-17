package Lec2;
import java.util.*;;
public class Pattern23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        while( row <= n){
            //space
            int i = 1;
            while( i <= space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while( j<= star){
                System.out.print("1 ");
                j++;
            }
            //next row prep
            row++;
            star+=2;
            space--;
            System.out.println();
            
  
        }
    }
    
}
