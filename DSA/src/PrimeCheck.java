
public class PrimeCheck {

	static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
			else
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(isPrime(11));
	}

}
