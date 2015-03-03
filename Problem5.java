
public class Problem5 {

	
	public static void main(String[] args) {
		boolean foundNumber = false;
		int count = 0;
		while (!foundNumber) {
			count++;
			for (int i = 1; i<= 20; i++){
				if (count % i==0) {
					foundNumber = true;
				}else {
					foundNumber = false;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
