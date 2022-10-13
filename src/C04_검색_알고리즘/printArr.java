package C04_검색_알고리즘;

public class printArr {
	static void printArr(int a[]) {
		System.out.print("arr[");
		for(int i=0; i<a.length; i++) {
			if(i!=a.length-1) {
				System.out.printf("%d, ", a[i]);
			} else {
				System.out.printf("%d]", a[i]);
			}
				
		}
	}
	
	/**
	 * 배열의 요소가 0으로 초기화 되있을 때
	 * @param a 시작 값이 0이 아닌 배열
	 */
	static void printArr2(int a[]) {
		System.out.print("arr[");
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
}
