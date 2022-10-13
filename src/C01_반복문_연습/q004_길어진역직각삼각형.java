package C01_반복문_연습;

import java.util.Scanner;

public class q004_길어진역직각삼각형 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0);
		// 길어진 역 직각 삼각형 출력
		System.out.println("\n길어진 역 직각 삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d ", i);
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}