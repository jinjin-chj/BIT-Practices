package Thurs;

class AryAvg {
	final int ROWS = 10;
	int[] numArr;

	AryAvg() {
		numArr = new int[ROWS];
	}

	private void input() {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) ((Math.random() * 10) + 1);
		}
	}

	private void output() {
		double avg = 0;
		double total = 0;
		
		System.out.print("������ ������ ");
		for (int i = 0; i < numArr.length; i++) {
			total = total + numArr[i];
			System.out.print(numArr[i] + " ");

		}
		System.out.println();
		avg = total / numArr.length;
		// total/10; ���� ����
		System.out.println("����� " + avg);

	}

	public void run() {
		input();
		output();

	}
}
