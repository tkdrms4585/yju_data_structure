package C08_정렬;

public class SelectionSort {
	// 배열 요소 a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 선택정렬
	static void selectionSort(int[] a, int n) {
		for(int i =0; i<n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
				
			}
			for (int k = 0; k < n; k++) {
				System.out.printf("%2d",a[k]);
			}
			System.out.printf("  min = a[%d]:%d\n", min, a[min]);
			swap(a, i, min);
			
		}
		System.out.println("최종");
		for (int k = 0; k < n; k++) {
			System.out.printf("%2d",a[k]);
		}
	}
	// 배열 출력
	static void print(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("x[%d]=%d\n", i, a[i]);
		}
	}
}
