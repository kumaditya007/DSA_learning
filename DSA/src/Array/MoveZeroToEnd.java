package Array;

public class MoveZeroToEnd {

	static void moveEnd(int arr[]) {

		int size = arr.length;

		for (int i = 0; i < size; i++) {

			if (arr[i] == 0) {
				for (int j = i + 1; j < size; j++) {

					if (arr[j] != 0) {

						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}

				}
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 0, 4, 0, 5, 6, 0, 8 };

		System.out.println("Before movement");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		MoveZeroToEnd.moveEnd(arr);

		System.out.println("After movement");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
