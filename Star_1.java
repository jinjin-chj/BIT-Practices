package java_hello;

public class Star_1 {		//�����. �ٵ� ���� ������� ���������� ǥ���س���!!

	public static void main(String[] args) {
		// 1. �����!! 5*5
		/*
		for(int i = 1; i<=5; i++) {		// ��(��)
			for(int j = 1; j <=5; j++) {	// ��(������)
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 2. ����� �ﰢ�� - �׳� �ܿ�~!
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 3. ������ �ﰢ��
		
		for(int i = 5; i >0; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 4. ������ ���ﰢ��
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i; j++) {
				if(i>j) {
				System.out.print(" ");
				} else 
					System.out.print("*"); 
			}
			System.out.println();
		}
		
		
		// 5. �׳� ���ﰢ��
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= 5; j++) {
				if(i<j) {
				System.out.print(" ");
				} else 
					System.out.print("*"); 
			}
			System.out.println();
		}
			
		
		// 6. ��.. �ﰢ�������ʤ�����., ���� �̰� ���� �� ��
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j >= i; j--) {
					System.out.print("*"); 
			}
			System.out.println();
		}
		
		// 7. ���ﰢ�� ��������.. (���� �� ��)
		
		for(int i = 5; i >0; i--) {
			for(int j = 5; j > 0; j--) {
				if(i<j) {
				System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		} 
		*/
		
		// 7-1. ���� �Ѱ� 
		
		for(int i=5; i>0; i--) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// �Ƕ�̵� �غ��� -> �����
		
	}

}
