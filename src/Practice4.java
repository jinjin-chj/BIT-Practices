
public class Practice4 {

	public static void main(String[] args) {
		// ����1. num ���� Ȧ���� true, ¦���� false
		
		int num = 9;
		boolean result;
		result = ((num % 2) != 0);
		//System.out.println(num + "�� " + result + " �Դϴ�.");
		
		
		// ����2. num�� ����� true, ������ false
		
		int num1 = 1000;
		boolean result1;
		result1 = (num1 > 0);		// 0��..false
		//System.out.println(num1 + "�� " + result1 + "�Դϴ�.");
		
		
		// ����3. n ������ true ��� �����ϱ�
		
		int n1 = 100;
		int n2 = 90;
		int n3 = 80;
		
		boolean isBig = (n1 > n2) && (n1 > n3);		// �׷�����~~~~~
		System.out.println(isBig);
		
		
		
	}

}
