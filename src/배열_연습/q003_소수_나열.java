package 배열_연습;

// 커밋 푸쉬 확인용 text
public class q003_소수_나열 {

	public static void main(String args[]) {
//		prime01();
//		prime02();
		prime03();

	}

	private static void prime03() {
		// 배열을 사용하여 소수로 계산
		int i, j, n, cnt = 0;
		boolean isPrime = true;
		int p[] = new int[1000];
		
		int point=0;
		p[point++] = 2;
		
		for (i = 3; i < 1000; i += 2) {
			isPrime = true;
			for (j = 0; j < point; j++) {
				cnt++;
				if (i % p[j] == 0)
					isPrime = false;
					break;
			}
			if(isPrime)
				p[point++]=i;
		}
		
		for(int a:p) {
			if(a == 0)
				break;
			System.out.print(a + ", ");
		}
		System.out.println("\n나눗셈 개수" + cnt);
	}

	private static void prime02() {
		// 홀수만 계산
		// 짝수는 한번만 계산하고 바로 빠지니깐 499번만 감소
		// 77521
		int i, j, n;
		int cnt = 0;
		boolean isPrime;
		System.out.print("2, ");
		for (i = 3; i < 1000; i += 2) {
			isPrime = true;
			for (j = 0; j < i - 2; j++) {

				cnt++;
				if (i % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + ", ");
			}

		}
		System.out.println("\n나눗셈 횟수는 " + cnt);
	}

	private static void prime01() {
		// 전체 검사
		// 78022
		int i, j, n;
		int cnt = 0;
		boolean isPrime;
		for (i = 0; i < 1000; i++) {
			n = i + 2;
			isPrime = true;
			for (j = 0; j < n - 2; j++) {

				cnt++;
				if (n % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(n + ", ");
			}

		}
		System.out.println("\n나눗셈 횟수는 " + cnt);
	}
}
