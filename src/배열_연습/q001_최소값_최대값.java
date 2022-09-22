package 배열_연습;

import java.util.Arrays;
import java.util.Random;

public class q001_최소값_최대값 {
	static int maxOf(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > max)
				max = arr[i + 1];
		}
		return max;
	}
	
	private static void printArr(int[] arr) {
		System.out.println("--배열 출력--");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d, ", arr[i]);
		}
		System.out.println();
	}

	// 배열의 원소를 역순으로만드는 메소드
	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
			System.out.printf("\n교체 %d\n", i+1);
			System.out.println(Arrays.toString(arr));
		}
	}

	// 배열의 원소 위치를 바꾸는코드
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[arr.length - i - 1];
		arr[arr.length - i - 1] = temp;
	}

	public static void main(String args[]) {
		int[] a = new int[5];
		Random rand = new Random();
		
		// 랜덤 원소 삽입
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}

		// 배열 출력
		System.out.println(Arrays.toString(a));
		
		System.out.println("\n배열의 원소 역순");
		reverse(a);

		// 배열 출력
		System.out.println(Arrays.toString(a));

		System.out.printf("\n배열의 최대값은 %d 입니다.", maxOf(a));
		
		// 모든 요소 합
		sum();
		
		// 모든 요소 역순 복사
		rcopy();
	}
}
