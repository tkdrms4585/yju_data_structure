package C08_정렬;

public class Main {
	public static void main(String args[]) {
		System.out.println("버블 정렬 v1.0");
		int nx = 8;
		int[] x = {7,6,4,3,7,1,9,8};
//		BubbleSort.print(x, nx);
//		System.out.println("정렬 후");
//		BubbleSort.print(x, nx);
//		
//		int[] x2 = {1,3,6,4,7,5,8,9};
//		BubbleSort.bubbleSort2(x2, nx);
		
		SelectionSort.selectionSort(x, nx);

	}
}
