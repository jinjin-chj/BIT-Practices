
public class WhileBasic {

	public static void main(String[] args) {

		int num = 0;
		
		while(num < 5) {	//5���� ���� ������ ����. false �϶� ��������
			System.out.println("I like Java " + num);
			num++;
		}
		
		
		System.out.println('\n');
		
		// do ~ while�� ����
		int num1 = 0;
		do {
			System.out.println("I like Java " + num1);
			num1++;
							
		} while(num1 < 5);
		
	}

}
