
public class Palindrome {

	static boolean isPal(int num) {
		int rev = 0;
		int temp = num;
		int ld;
		while (temp != 0) {

			ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;
		}
		return (num == rev);
	}

	public static void main(String[] args) {

		System.out.println(isPal(121));

	}

}
