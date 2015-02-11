
public class Problem3 {
	public static void main(String [] args) {
		long x = 600851475143L;
		long lFactor = 2L;
		long sFactor = 2L;
		long sOfLFactor = 0L;
		sFactor = smallestFactor (x);
		lFactor = x/sFactor;
		while (sOfLFactor != lFactor) {
			sOfLFactor = smallestFactor (lFactor);
			if (lFactor != sOfLFactor) {
			lFactor = lFactor / sOfLFactor ;
			}
		}
		System.out.println(lFactor);
	}
	public static long smallestFactor (long number) {
		long counter = 2L;
		while (number % counter != 0 ) {
			counter ++;
		}
		return counter;
	}
}