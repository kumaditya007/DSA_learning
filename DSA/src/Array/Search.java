package Array;

public class Search {

	static boolean search(int arr[], int length, int val) {

		for (int i = 0; i < length; i++) {

			if (arr[i] == val) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40 };
		int x = 30;

		System.out.println(Search.search(arr, arr.length, x));

	}

}
