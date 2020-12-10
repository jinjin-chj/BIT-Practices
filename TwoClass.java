package Thurs;

class TwoClass {
	int[][] arr;

	final int ROWS = 4;
	final int COLS = 4;

	TwoClass() {
		arr = new int[ROWS][COLS];

	}

	private void input() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
	}

	private void output() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void run() {
		input();
		output();
	}

}
