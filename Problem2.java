
public class Problem2 {
	public static void main(String [] args) {
		double a = 1.0;
		double b = 0.0;
		double sum = 0.0;
		double fib = 0.0;
		while (fib <= 4000000.0) {
			fib = a + b;
			b = a;
			a = fib;
			if (fib % 2 == 0.0){
				sum += fib;
			}
		}
		System.out.println(sum);
	}

}
