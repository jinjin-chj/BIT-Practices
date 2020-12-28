import java.util.Scanner;

class Practice1_Count_JaMo {
	// 사용자로부터 받은(system.in) 문자열(영문으로)에서
	// 자음과 모음(변수 2개) 개수를 계산하는(count) 프로그램을 작성하라.
	public static void main(String[] args) {
		int countJa = 0, countMo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오(영문) >> ");

		String text = sc.nextLine();

		for (int i = text.length() - 1; i >= 0; i--) {
			char ch = text.charAt(i);

			switch (ch) {
			case ('a'):
			case ('e'):
			case ('i'):
			case ('o'):
			case ('u'):
				countJa++;
				break;
			default:
				countMo++;
			}
		}
		sc.close();
		System.out.println("자음 개수: " + countJa + "개");
		System.out.println("모음 개수: " + countMo + "개");
	}
}

