package Array;

public class LeaderInArray {

	static void leader(int arr[]) {

		int lead = 0;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			boolean flag = false;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 12, 40, 4, 0, 5, 6, 0, 8 };

		System.out.println("Before rotation");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("After rotation");
		LeaderInArray.leader(arr);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

}
