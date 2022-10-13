package C04_검색_알고리즘;

import java.util.Random;

public class q02_이진탐색 {
	static int NUM = 10;
	
	/*
	 * 
	 */
	
	
	public static void main(String args[]) {
		int[] x = new int[NUM + 1];
		Random rand = new Random();
		
		System.out.println("랜덤 분포 수열 생성");
		for (int i = 0; i < NUM; i++) {
			x[i] = rand.nextInt(11);
			System.out.printf("x[%2d]:%d", i, x[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		
		
	}
}
