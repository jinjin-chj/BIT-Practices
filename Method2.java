package java_hello;

public class Method2 {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���.");
		
		double myHeight = 175.9;
		
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byeEveryone();
	}
	
	public static void hiEveryone(int age, double height) {		//ȣ�� �� , value �ΰ� �־���� ��
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� Ű�� " + height + "cm �Դϴ�.");
	}
	
	public static void byeEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
