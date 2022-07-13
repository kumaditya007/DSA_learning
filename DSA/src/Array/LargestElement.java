package Array;

public class LargestElement {

	static int largeEl(int arr[]) {

		int res = 0;
		int lenght = arr.length;
		for (int i = 1; i < lenght; i++) {

			if (arr[i] > arr[res]) {

				res = i;

			}
		}
		return res;

	}

	public static void main(String[] args) {

		int arr[] = { 3, 8, 12, 5, 6, 30, 26, 78, 92 };
		int larg = LargestElement.largeEl(arr);
		System.out.println("Largest Element : " + arr[larg]);

	}

}
