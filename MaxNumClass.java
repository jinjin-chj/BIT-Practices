package Thurs;

class MaxNumClass {	// ���� �ٽ� ȥ�ڼ� �غ���..

	public static int maxArr(int[] arr) {

		if (arr == null) { // nullüũ ������
			System.out.println("�迭�� �����ϴ�.");
			// return -1; // �� �Ҹ���? 0�� ����,,
			return Integer.MAX_VALUE; 
			// ������ ����
		}

		// int max = arr[0];
		int max = Integer.MIN_VALUE; 
		// ������ ����

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10) + 1);
		}
		return max;
	}

	/*
	 * public static void main(String[] args) { // �� ����
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
	 * System.out.println("���� ū ���ڴ� " + max);
	 * 
	 * }
	 */
}
