package C01_반복문_연습;

import java.util.Scanner;

public class q007_마름모 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0);

		System.out.println("\n마름모");
		// 윗부분
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d ", i);
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 아랫부분
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%3d ", i + n);
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}