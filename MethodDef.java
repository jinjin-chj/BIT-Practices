package java_hello;

public class MethodDef {

	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		hiEveryone(12);		// 12�� �����ϸ� hiEveryone "ȣ��" _ �Լ� ���!!
		hiEveryone(13);		// 13�� �����ϸ� hiEveryone ȣ��
		System.out.println("���α׷��� ��");
	}
	
	public static void hiEveryone(int age) {	// �Ű������� �ϳ��� �޼ҵ��� "����"_ �Լ� �����!!
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
	}

}
