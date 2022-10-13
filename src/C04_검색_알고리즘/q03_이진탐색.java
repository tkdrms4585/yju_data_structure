package C04_검색_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q03_이진탐색 {
	static int NUM = 10;
	public static void main(String args[]) {
		int[] x = new int[NUM + 1];
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("랜덤 분포 수열 생성");
		for (int i = 0; i < NUM; i++) {
			x[i] = rand.nextInt(11);
			System.out.printf("x[%2d]:%d", i, x[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		
		Arrays.sort(x);
		
		printArr.printArr(x);
		
		System.out.println("\n검색 값 : ");
		
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("검색값의 요소가 없다 닝겐");
		} else {
			System.out.printf("검색 값은 x[%d]에 있다 닝겐\n", idx);
		}
	}
}
