package Thurs;

import java.util.Scanner;

class TheaterArr {

	private final int ROWS = 10;
	private final int COLS = 10;
	private int[] seatLine1;
	private int[] seatLine2;

	public TheaterArr() {
		this.seatLine1 = new int[ROWS];
		this.seatLine2 = new int[COLS];
	}

	private void input() {
		for (int i = 0; i < seatLine1.length; i++) {
			seatLine1[i] = i;
		}
		for (int i = 0; i < seatLine2.length; i++) {
			seatLine2[i] = 0;
		}
	}

	private void seatPrint() {
		System.out.println("-------------------");
		for (int i = 0; i < seatLine1.length; i++) {

			System.out.print(seatLine1[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		for (int i = 0; i < seatLine2.length; i++) {
			System.out.print(seatLine2[i] + " ");
		}
		System.out.println();
	}

	private void Ticketing() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 좌석을 예약 하시겠습니까? ");
		int myseat = sc.nextInt();

		System.out.println("-------------------");
		for (int i = 0; i < seatLine1.length; i++) {

			System.out.print(seatLine1[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		for (int i = 0; i < seatLine2.length; i++) {
			if (myseat == seatLine1[i]) {
				seatLine2[i] = 1;
			}
			System.out.print(seatLine2[i] + " ");
		}
		sc.close();
	}

	public void run() {
		input();
		seatPrint();
		Ticketing();
	}

}
