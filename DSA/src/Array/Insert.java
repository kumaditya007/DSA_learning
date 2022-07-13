package Array;

/*	public class Insert {

	static int[] insert(int arr1[], int val1, int pos1, int cap1) {

		for (int i = (cap1); i >= pos1; i--) {

			arr1[i] = arr1[i - 1];
		}
		arr1[pos1 - 1] = val1;

		return arr1;
	}

	public static void main(String[] args) {

		int arr[] = new int[10];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 8;
		arr[3] = 12;

		int repValue = 7;
		int pos = 2;
		int cap = 5;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		System.out.println("=========================");

		int arr1[];
		arr1 = Insert.insert(arr, repValue, pos, cap);

		for (int j = 0; j < arr1.length; j++) {

			System.out.println(arr[j]);
		}

	}

}
*/

public class Insert {
	static int Insert(int arr[], int n, int x, int cap, int pos) {
		if (n == cap)
			return n;

		int idx = pos - 1;

		for (int i = n - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}

		arr[idx] = x;

		return n + 1;
	}

	public static void main(String args[]) {
		int arr[] = new int[5], cap = 5, n = 3;

		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 20;

		System.out.println("Before Insertion");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int x = 7, pos = 2;

		n = Insert(arr, n, x, cap, pos);

		System.out.println("After Insertion");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}