import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		/*
		Grade me = new Grade(90, 100, 80);
		System.out.println("평균은 " + me.avg());
		*/
		
		Scanner scanner = new Scanner(System.in);	//키보드생성
		System.out.println("숫자를 입력하세요.");
		int num1 = scanner.nextInt();	//키보드 입력값이 넘어감
		String name = scanner.next();
		int num2 = scanner.nextInt();
		
		System.out.println("당신이 입력한 숫자는: " +num1);
		System.out.println("당신이 입력한 문자는: " +name);
		System.out.println("당신이 입력한 숫자는: " +num2);
		scanner.close();
	}

}
