package C04_검색_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class q01_선형검색 {
	/*
	 * 100개의 랜덤한 정수값을 가진 배열 생성 여기서 5가 들어있는 배열의 인덱스 검색 못찾으면 못찾아다고 출력
	 */

	static final int NUM = 100;
	
	static void printArr(int a[]) {
		System.out.print("a[");
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				System.out.print("]");
				break;
			}
			System.out.printf("%d", a[i]);
			if(a[i+1]!=0) {
				System.out.print(", ");
			}
				
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
		
		// 선택정렬
		System.out.println();
		int key = 5;
		int idx = SeqSearch.seqSearch(x, NUM, key);

		if (idx == -1)
			System.out.println("검색 값의 요소가 없다 닝겐~\n");
		else
			System.out.printf("검색 값은 x[%d]에 있다 닝겐\n", idx);
		
		System.out.println();
		
		// 이진 탐색을 위한 버블 소트
		BubbleSort.bubbleSort(x);
		// 정렬 결과 출력
		// 배열 마지막에 보초수가 있기 때문에 크기 -1
		for(int i = 0; i<x.length-1; i++) {
			System.out.printf("x[%2d]:%d", i, x[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		System.out.println();
		
		// 이진탐색
		idx = BinSearch.binSearch(x, NUM, key);

		if (idx == -1)
			System.out.println("검색 값의 요소가 없다 닝겐~\n");
		else
			System.out.printf("검색 값은 x[%d]에 있다 닝겐\n", idx);
		
		// 요소에서 key의 위치 탐색
		int[] idx2 = new int[NUM];
		key = 5;
		int b = SeqSearch.seqSerarch3(x, NUM, key, idx2);
		System.out.println("검색 개수는" + b + "개 입니다.");
		printArr(idx2);
		System.out.print("번째에 있습니다.\n");
	}
}
