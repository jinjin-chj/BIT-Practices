import java.util.Scanner;

public class RE_GradeMain {

	public static void main(String[] args) {
		Scanner scanner = null;
		while (true) {
			scanner = new Scanner(System.in);

			System.out.println("���� ���� ������ �Է��ϼ���.");
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();

			RE_Grade grade = new RE_Grade(kor, eng, math);
			grade.avg();
			System.out.println("����� " + grade.avg());

			System.out.println("��� �Ͻðڽ��ϱ�?");

			char ch = scanner.next().charAt(0);	//ù���ڰ�y�鰡��, yes�� ��
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("���α׷� ����.");
	}

}
