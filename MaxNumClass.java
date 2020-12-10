package Thurs;

class MaxNumClass {	// 몰라 다시 혼자서 해보기..

	public static int maxArr(int[] arr) {

		if (arr == null) { // null체크 잊지마
			System.out.println("배열이 없습니다.");
			// return -1; // 뭔 소리고? 0도 가능,,
			return Integer.MAX_VALUE; 
			// ㄴ같은 말임
		}

		// int max = arr[0];
		int max = Integer.MIN_VALUE; 
		// ㄴ같은 말임

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10) + 1);
		}
		return max;
	}

	/*
	 * public static void main(String[] args) { // 쌤 버전
	 * 
	 * int[] numArr = new int[5];
	 * 
	 * for (int i = 0; i < numArr.length; i++) { 
	 * numArr[i] = (int) ((Math.random() *10) + 1); }
	 * 
	 * int max = numArr[0]; 
	 * for (int i = 1; i < numArr.length; i++) { 
	 * if (max < numArr[i]) max = numArr[i];
	 * 
	 * } 
	 * System.out.println("가장 큰 숫자는 " + max);
	 * 
	 * }
	 */
}
