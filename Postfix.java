
public class Postfix {

	public static void main(String[] args) {
		// ����1
		int num = 5;
		System.out.print((num++) + " ");
		System.out.print((num++) + " ");
		
		System.out.print(num + "\n");
		
		System.out.print(num + (int)'\n');		
		
		/* ������? 
		 * 1. �ϴ� "\n" = '\n'
		 * 2. �׳� sysout('\n'); �ϸ� ���� ��
		 * 3. �ٵ� sysout(num + '\n'); �ϸ� ������ ��.
		 * 		����:  num�� int���̶� char���� '\n'�� int�� �ڵ� �� ��ȯ�� �ż� �ƽ�Ű�ڵ尪���� �ڵ� ��ȯ��.  
		 */
		
		
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		System.out.println(num);
		
		
		// ����2
		int num1 = 7;
		num1--;
		System.out.println("\n" + num1);
		
		
		// ����3
		int num2 = 7;
	
		int result;
		
		result = (++num2) - 5;
		System.out.println("\n" + result);
		
		result = (num2++) - 5;
		System.out.println(result);
		System.out.println(num2);
		
		
		// ����4
		int x = 10;
		int y = x-- + 5 + --x;		// ������ 3�� �̻��̸� ������� 2��. �տ� ���� �ϰ� ���� �����ϰ� �ڿ� ������.
		System.out.println("\n" + y);
		
	}

}
