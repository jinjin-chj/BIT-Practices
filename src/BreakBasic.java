
public class BreakBasic {		// ���� ���� �� 40��

	public static void main(String[] args) {
		int num = 1
		boolean search = false; //�� ���̰�
		
		// 5�� 7�� �ּ� ����� ã�� �ݺ���
		while(num < 100) {
			if ((num % 5 ==0) && (num % 7 ==0)) {
				search = true;
				break;		//while�� Ż�� ����â
			}
			num++;	
		}
		
		if (search)		//�� search???
			System.out.println("ã�� ���� : " + num);
		else
			System.out.println("5�� ������� 7�� ����� ���� ã�� ���߽��ϴ�.");

	}

}
