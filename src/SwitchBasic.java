
public class SwitchBasic {	

	public static void main(String[] args) {
		// switch - case ��
		
		int n = 1;	//100���� �ϸ� "����Ʈ"��(�������ͼ�) �� �ؿ��� ��µ�
		
		switch(n) {
			case 1:
				System.out.println("Simple Java");
				
			case 2:
				System.out.println("Funny Java");
				
			case 3:
				System.out.println("Fantastic Java");
				//break������ switch {}��������
			default:
				System.out.println("The best programming language");	
		}
		
		System.out.println("Do you like Java?");

	}

}
