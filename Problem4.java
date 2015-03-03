
public class Problem4 {
	public static void main(String[] args) {
		int x = 0;
		outerloop:
		for (int i = 998001; i > 0; i--) {
			if (IsItPalindrome(i))  {
				for (int j = 100; j< 1000; j++) {
					if ((i%j==0) && ((i/j)>=100) && (i/j) < 1000) {
						x = i;
						break outerloop;
					}
				}
			}
		}
		System.out.println (x);
	}
	public static boolean IsItPalindrome (int x) {
		boolean prime = false;
		String ofInt = Integer.toString(x);
		for (int i = 0;i < ofInt.length(); i++) {
			if (ofInt.charAt(i)==(ofInt.charAt(ofInt.length()-1-i))) {
				prime = true;
			} else {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
