package java_hello;

public class Practice9 {

	public static void main(String[] args) {
		// 1. ¦���� ��� /continue��� �ϸ� ����~! 
		/*
		for(int i = 2; i < 10; i++) {
			
			if (i % 2 != 0)
				continue;
			
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));				
			}
		}
		
		// 2. �ᱣ���� Ȧ���� ��
		
		for(int i = 3; i <10; i++) {
			for(int j = 1; j <10; j++) {
				if(i*j % 2 == 0)
					continue;	//�ƴϸ� continue���� if(Ȧ��)�� �ص� ��! else����.
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		// 3. 3�� ���ϱ�
		
		int i = 3;
		for(int j = 1; j <10; j++)
			System.out.println(i + " x " + j + " = " + (i*j));
		
		
		// 4. ������_ �ᱣ���� 2�� 3�� ���
		
		for(int i = 2; i <10; i++) {
			for(int j = 1; j<10; j++) {
				if( ((i*j) % 2 == 0) && ((i*j) % 3 == 0) ) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
			
		}
		*/
		
		// 5. ������_ �ᱣ���� ¦���� ���� ����
		
		int evenCount = 0;
		
		for(int i = 2; i <10; i++) {
			
			for(int j = 1; j <10; j++) {
				
				if((i*j) % 2 == 0) {
					evenCount++;	
					
					System.out.println(i + " x " + j + " = " + (i*j) + " / ī��Ʈ: " + evenCount);
				}
			}
		}
		System.out.println(evenCount);
		

	}

}
