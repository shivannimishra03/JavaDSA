public class Maximum_3_Number {
    public static void main(String[] args) {
		
		int a = 185;
		int b = 74;
		int c = 91;
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}
}
