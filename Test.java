import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ���� ���� �� ����
		Scanner scanner = null;
		System.out.println("~ ������ �������� ~");

		while (true) {
			scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("1.���� / 2.���� /3.�� �Է��ϼ���.");

			int comNum = (int) (Math.random() * 3) + 1;
			int myNum = scanner.nextInt();
			
			System.out.print("��ǻ�Ͱ� ");
			if(comNum == 1) {
				System.out.print("����");
			} else if(comNum == 2) {
				System.out.print("����");
			} else {
				System.out.print("��");
			}
			System.out.println("�� �½��ϴ�.");
			
			System.out.print("����ڰ� ");
			if(myNum == 1) {
				System.out.print("����");
			} else if(myNum == 2) {
				System.out.print("����");
			} else {
				System.out.print("��");
				
			}
			System.out.println("�� �½��ϴ�.");
			System.out.println();
			
			if((comNum==1 && myNum ==2) ||(comNum==2 && myNum ==3)||(comNum==3 && myNum ==1)) {
				System.out.println("�̰���ϴ�.");
			} else if (comNum==myNum) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�����ϴ�.");
			}
			
			System.out.println(">> ��� �Ͻðڽ��ϱ�? (Y / N)");
			char anwser = scanner.next().charAt(0);
			if(anwser=='y' || anwser=='Y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("~ ���� ���� ~");
	}

}
