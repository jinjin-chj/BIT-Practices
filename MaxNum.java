package Thurs;

class MaxNum {

	public static void main(String[] args) {
		// �� ����

		int[] numArr = new int[5];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) ((Math.random() * 10) + 1);
		}

		int max = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (max < numArr[i])
				max = numArr[i];

		}
		System.out.println("���� ū ���ڴ� " + max);

	}

}
