import java.util.Scanner;

public class Scanner_GradeMain {

	public static void main(String[] args) {
		// ���� ���α׷� �����
		Scanner scanner = null;
		//Scanner scanner = new Scanner(System.in); //�� �ص� ��.
		while (true) {
			scanner = new Scanner(System.in);
			
			System.out.println("����, ����, ������ �Է��ϼ���.");
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();

			Grade grade = new Grade(kor, eng, math);
			grade.avg();
			System.out.println("����� " + grade.avg());
			
			System.out.println("����Ͻðڽ��ϱ�? (Y/N)");

			char ch = scanner.next().charAt(0);	//0��° ���ڿ��� �ްڴ�.
			// String yesorno = scanner.next();
			// if(yesorno.equals("Y") || yesorno.equals("y"))
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
