import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		/*
		Grade me = new Grade(90, 100, 80);
		System.out.println("����� " + me.avg());
		*/
		
		Scanner scanner = new Scanner(System.in);	//Ű�������
		System.out.println("���ڸ� �Է��ϼ���.");
		int num1 = scanner.nextInt();	//Ű���� �Է°��� �Ѿ
		String name = scanner.next();
		int num2 = scanner.nextInt();
		
		System.out.println("����� �Է��� ���ڴ�: " +num1);
		System.out.println("����� �Է��� ���ڴ�: " +name);
		System.out.println("����� �Է��� ���ڴ�: " +num2);
		scanner.close();
	}

}
