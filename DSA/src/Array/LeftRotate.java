package Array;

public class LeftRotate {

	static void leftRotate(int arr[]) {
		int size = arr.length;
		int temp = arr[0];
		for (int i = 1; i <= size - 1; i++) {

			arr[i - 1] = arr[i];
		}
		arr[size - 1] = temp;

	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 0, 4, 0, 5, 6, 0, 8 };

		System.out.println("Before rotation");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		LeftRotate.leftRotate(arr);

		System.out.println("After rotation");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
