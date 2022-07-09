
public class Countdigits {

	static double count(double n) {
		double cnt = 0;
		while (n < 0) {
			n = n / 10;
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {

//		Countdigits cdigit = new Countdigits();
//		double response = cdigit.count(500000);
		double num = 845489;
		System.out.println(count(num));
	}

}
