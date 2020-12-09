package Wed;

public class EnhancedFor {

	public static void main(String[] args) {
		// for-each문의 예 (= enhanced for문)

		int[] ar = { 1, 2, 3, 4, 5 };

		// 배열 요소 전체 출력
		for (int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println(); // 개행

		int sum = 0;

		// 배열 요소의 전체 합 출력
		for (int e : ar) {
			sum += e;
		}
		System.out.println("sum: " + sum);

	}

}
