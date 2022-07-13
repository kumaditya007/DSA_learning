
public class DivisorOFnumber {

	static void DivNum(int n) {

		for (int i = 1; i * i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}

	}

	public static void main(String[] args) {

		DivNum(75);
		System.out.println("List of all the divisors");
	}

}
