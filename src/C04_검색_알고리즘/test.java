package C04_검색_알고리즘;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class test {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> NAME_ORDER = new NameOrderComparator();

		private static class NameOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return d1.name.compareTo(d2.name);
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdSt = new Scanner(System.in);

		PhyscData[] x = { 
				new PhyscData("강신성", 178, 0.7), 
				new PhyscData("고건호", 162, 0.3),
				new PhyscData("노태권", 177, 0.1), 
				new PhyscData("박준홍", 171, 1.5), 
				new PhyscData("유다연", 175, 2.0),
				new PhyscData("조현주", 168, 0.4), 
				new PhyscData("진솔미", 174, 1.2), 
				new PhyscData("하영수", 169, 0.8),
		};

		System.out.print("어떤 닝겐을 찾고 있냐? : ");
		String name = stdSt.nextLine();
		int idx = Arrays.binarySearch(x, new PhyscData(name, 0, 0.0), PhyscData.NAME_ORDER);

		if (idx < 0)
			System.out.println("그런 닝겐은 없다.");
		else {
			System.out.println("x[" + idx + "]에 있다.");
			System.out.println("찾은 닝겐의 정보: " + x[idx]);
		}
	}
}