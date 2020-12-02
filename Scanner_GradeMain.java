import java.util.Scanner;

public class Scanner_GradeMain {

	public static void main(String[] args) {
		// 성적 프로그램 만들기
		Scanner scanner = null;
		//Scanner scanner = new Scanner(System.in); //로 해도 됨.
		while (true) {
			scanner = new Scanner(System.in);
			
			System.out.println("국어, 영어, 수학을 입력하세요.");
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();

			Grade grade = new Grade(kor, eng, math);
			grade.avg();
			System.out.println("평균은 " + grade.avg());
			
			System.out.println("계속하시겠습니까? (Y/N)");

			char ch = scanner.next().charAt(0);	//0번째 문자열을 받겠다.
			// String yesorno = scanner.next();
			// if(yesorno.equals("Y") || yesorno.equals("y"))
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("프로그램이 종료되었습니다.");

	}

}
