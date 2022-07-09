
public class TrailingZeroFactorial {

	static int countZero(int num) {
		int fact = 1;
		int count = 0;

		for (int i = 1; i <= num; i++)
			fact = fact * i;

		while (fact % 10 == 0) {

			count++;
			fact = fact / 10;

		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(countZero(10));
	}
}
