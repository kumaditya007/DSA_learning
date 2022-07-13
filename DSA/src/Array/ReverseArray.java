package Array;

public class ReverseArray {

	static void rev(int arr[]) {

		int low = 0, high = arr.length - 1;

		while (low < high) {

			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 8, 12, 5, 6, 30, 26, 78, 92 };

		System.out.println("before operation");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("==================");

		ReverseArray.rev(arr);

		System.out.println("After operation");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
