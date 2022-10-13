package C04_검색_알고리즘;

public class SeqSearch {
	/**
	 * 
	 * @param a   탐색할 배열
	 * @param n   배열의 인덱스 끝
	 * @param key 배열에서 찾을 요소
	 * @return i가 배열의 끝에 도달하면 -1 <br>
	 *         a[i]의 요소가 찾는 key값이면 i 반환
	 */
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)
				return -1;
			if (a[i] == key)
				return i;
			i++;
		}
	}

	static int seqSearch2(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		while (a[i] == key) {
			break;
		}
		i++;
		if (i == n) {
			return -1;
		}
		return i;
	}

	/**
	 * 원소의 개수가 n인 배열 a에서 key와 일치하는 요소의 인덱스를
	 * 배열 idx에 앞쪽에 순서대로 저장
	 * 일치하는 원소의 개수를 반환하는 메소드 구현
	 * @param a 탐색할 배열
	 * @param n 탐색 크기
	 * @param key 찾을 값
	 * @param idx key의 위치를 저장할 배열
	 * @return a 배열에서 key의 개수
	 */
	static int seqSerarch3(int[] a, int n, int key, int[] idx) {
		int i;
		int cnt = 0;
		
		for(i=0; i<n;i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}
		}
		
		return cnt;
	}
}
