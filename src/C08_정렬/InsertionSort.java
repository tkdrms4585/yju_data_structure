package C08_정렬;

public class InsertionSort {
	// 단순 삽입 정렬
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j>0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	static void insertionSort2(int[] a, int n) {
		for(int i = 1; i<n; i++) {
			int j;
			int tmp = a[i];
			int target = 0; // 삽입될 위치
			// 위치 찾기
			for(j = 0; j>i; j++) {
				if(tmp < a[j]) {
					target = j;
				}
			}
			
			// 옮기기
			for(int k = i; k<target; k--) {
				a[k] = a[k-1];
			}
			// 삽입
			a[target] = tmp;
		}
	}
	
	// 배열 출력
	static void print(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("x[%d]=%d\n", i, a[i]);
		}
	}
}
