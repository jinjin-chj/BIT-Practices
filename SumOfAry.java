package Wed;

public class SumOfAry {

	public static void main(String[] args) {
		// 뭘 위한 건지 모르겠음

		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = sumOfAry(ar); // 배열의 참조 값 전달
	}

	static int sumOfAry(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++)
			sum += ar[i];
		return sum;
	}

	static int[] makeNewIntAry(int len) {
		int[] ar = new int[len];
		return ar; // 배열의 참조 값 반환 가능
	}

}
