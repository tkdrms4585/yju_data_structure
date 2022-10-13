package C04_검색_알고리즘;

public class BubbleSort {
	/**
	 * @param a   정렬할 배열
	 */
	static void bubbleSort(int[] a) {
		// 배열 끝에 보초수가 있어서 배열 크기 -2
		for (int i = a.length - 2; i > 1; i--) {
			for (int j = i - 1; j > 0; j--) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
