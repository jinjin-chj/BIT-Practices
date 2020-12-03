import java.util.Scanner;

public class RE_GradeMain {

	public static void main(String[] args) {
		Scanner scanner = null;
		while (true) {
			scanner = new Scanner(System.in);

			System.out.println("국어 영어 수학을 입력하세요.");
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();

			RE_Grade grade = new RE_Grade(kor, eng, math);
			grade.avg();
			System.out.println("평균은 " + grade.avg());

			System.out.println("계속 하시겠습니까?");

			char ch = scanner.next().charAt(0);	//첫글자가y면가능, yes도 됨
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("프로그램 종료.");
	}

}
