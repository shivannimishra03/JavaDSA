package Lec4;

public class GCD {
    public static void main(String[] args) {
		
		int divisor = 60;
		int dividend = 36;
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}
}
