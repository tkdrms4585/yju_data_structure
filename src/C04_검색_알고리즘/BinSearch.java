package C04_검색_알고리즘;

public class BinSearch {
	/**
	 * @param a   탐색할 배열
	 * @param n   배열의 인덱스 끝
	 * @param key 배열에서 찾을 요소
	 * @return i가 배열의 끝에 도달하면 -1 <br>
	 *         a[i]의 요소가 찾는 key값이면 i 반환
	 */
	static int binSearch(int[] a, int n, int key) {
		int p1 = 0;
		int p2 = n - 1;

		do {
			int pc = (p1 + p2) / 2;

			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				p1 = pc + 1;
			else
				p2 = pc - 1;
		} while (p1 <= p2);

		return -1;
	}
	
	static int binSearch2(int[] a, int n, int key) {
		int p1 = 0;
		int p2 = n - 1;

		do {
			int pc = (p1 + p2) / 2;
			System.out.printf(String.format("%%%ds<-%%%ds+",(p1*4)+1,(p2*4), "","") );
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				p1 = pc + 1;
			else
				p2 = pc - 1;
		} while (p1 <= p2);

		return -1;
	}
	
	
}