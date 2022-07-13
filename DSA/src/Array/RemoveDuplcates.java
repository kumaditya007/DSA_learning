package Array;

public class RemoveDuplcates {

	/*
	 * static int remDups(int arr[], int n) { int temp[] = new int[n];
	 * 
	 * temp[0] = arr[0];
	 * 
	 * int res = 1;
	 * 
	 * for (int i = 1; i < n; i++) { if (temp[res - 1] != arr[i]) { temp[res] =
	 * arr[i]; res++; } }
	 * 
	 * for (int i = 0; i < res; i++) { arr[i] = temp[i]; }
	 * 
	 * return res; }
	 * 
	 * public static void main(String args[]) { int arr[] = { 0, 1, 2, 3, 4, 5, 6,
	 * 8, 8 }, n = 9;
	 * 
	 * System.out.println("Before Removal");
	 * 
	 * for (int i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
	 * 
	 * System.out.println();
	 * 
	 * n = remDups(arr, n);
	 * 
	 * System.out.println("After Removal");
	 * 
	 * for (int i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
	 * 
	 * }
	 */

//Efficient method

	static void remDups(int arr[]) {

		int res = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}

	}

	public static void main(String args[]) {
		int arr[] = { 0, 1, 2, 3, 4, 4, 5, 6, 8, 8 };

		System.out.println("Before Removal");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		RemoveDuplcates.remDups(arr);

		System.out.println("After Removal");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
