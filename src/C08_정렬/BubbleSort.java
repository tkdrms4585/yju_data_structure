package C08_정렬;

public class BubbleSort {
	// 배열 요소 a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0;
		int scnt = 0;
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < n; k++) {
					System.out.printf("%2d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				}
				System.out.println();
				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
			}
			for (int k = 0; k < n; k++) {
				System.out.printf("%2d%2c", a[k], ' ');
			}
			System.out.println();
		}
	}

	// 버블 정렬2 교환이 일어나지 않으면 정렬 멈춤
	static void bubbleSort2(int[] a, int n) {
		int ccnt = 0;
		int scnt = 0;
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d\n", i + 1);
			scnt = 0;
			// 교환횟수 초기화
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < n; k++) {
					System.out.printf("%2d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				} // end for k
				System.out.println();
				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
				
			} // end for j
			for (int k = 0; k < n; k++) {
				System.out.printf("%2d%2c", a[k], ' ');
			} // end for k2
			System.out.println();
			// 교환이 일어났는지 체크
			if (scnt == 0) {
				System.out.println("더 이상 교환 없음");
				break;
			}
		} // end for i
	}

	// 배열 출력
	static void print(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("x[%d]=%d\n", i, a[i]);
		}
	}

}
