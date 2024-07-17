public class Increment_Decrement1 {
    
    public static void main(String[] args) {
        int a = 6;
        int x = a++ + 6 + a-- - a-- + a++ - a++;
        System.out.println(x);
        int x1 = a-- + 7 + a-- + 8 + a++;
        System.out.println(x1);

        int b = 10;
        System.out.println(++b);
        System.out.println(b);

        int c = 19;
        System.out.println(--c);
        System.out.println(c);
    }
}
