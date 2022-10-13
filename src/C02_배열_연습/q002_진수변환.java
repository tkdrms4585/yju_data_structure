package C02_배열_연습;

import java.util.Scanner;

public class q002_진수변환 {
	/**
	 * @param	x	입력받은 값, 변환할 값
	 * @param	r
	 * @param	d
	 * @return	digits	n진수로 변환이 된 값
	 */
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 자리수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int no, cd, dno;
		char[] cno = new char[32];
		System.out.println("10진수 기수를 변환");
		do {
			System.out.println("변환할 음이 아닌 정수");
			no = sc.nextInt();
		} while (no < 0);

		cd = 1;

		for (int i = 0; i < 5; i++) {
			cd *= 2;
			System.out.printf("%2d 진수로  ", cd);
			dno = cardConv(no, cd, cno);
			for (int j = 0; j < dno; j++) {
				System.out.print(cno[j] + " ");
			}
			System.out.println();

		}


	}
}
