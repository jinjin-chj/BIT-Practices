
public class Practice5 {

	public static void main(String[] args) {
		/*
		 * 1. int num = 33 �Ҵ� ��, �ش� ���� ¦��, Ȧ�� ���
		 * 2. int num = 66 �Ҵ� ��, 2�� ����̰� 3�� ����̸� �ش� �� ���, �ƴϸ� 2�� ����̰� 3�� ����� �ƴմϴ�. ���
		 * 3. ���׿����� ����
		 * 4. '80, 33, 55' �� �ִ밪 ���
		 * 
		 * */
		
		//1.
		
		int num = 33;
		
		if ((num % 2) != 0) {
			System.out.println(num + "�� Ȧ���Դϴ�.");
			
		} else
			System.out.println(num + "�� ¦���Դϴ�.");
		
		System.out.println('\n');
		
		//2.
		
		int num2 = 66;
		
		if ((num2 % 2 == 0) && (num2 % 3 == 0)) {
			System.out.println(num2 + "�� 2�� 3�� ����Դϴ�.");
	
		} else
			System.out.println(num2 + "�� 2�� 3�� ����� �ƴմϴ�.");
		
		System.out.println('\n');
		
		// 3-1.
		int num3 = (5 < 4) ? 50 : 40;
			System.out.println(num3);
			
		/* 3-2.====================================================
		 * int num3 = 0;		//���� ���� �ᱣ��
		 * if(5 < 4) {
		 * 		num3 = 50;
		 * }else{
		 * 		num3 = 40;
		 * }
		 * 
		 */
			
		System.out.println('\n');
			
		// 4-1.
			
		int n1 = 80;
		int n2 = 33;
		int n3 = 55;
		int max = 0;
		
		if (n1 > n2) {
			if (n1 > n3) {
				max = n1;
			} else {
				max = n3;
			}
		} else {
			if(n2 > n3) {
				max = n2;
			} else {
				max = n3;
			}
		}
		
		System.out.println(max);
		
		/* 4-2.=================================================
		 * 
		 * int n1 = 80;
		 * int n2 = 33;
		 * int n3 = 55;
		 * int max = 0;
		 * 
		 * if((n1 > n2) && (n1 > n3)) {
		 * max = n1;
		 * 
		 * } else if((n2 > n3) && (n2 > n3)) {
		 * max = n2;
		 * 
		 * } else {
		 * max = n3;
		 * }
		 * sysout(max);
		 * 
		 * 
		 * 4-3.==================================================
		 * 
		 * int n1 = 80;
		 * int n2 = 33;
		 * int n3 = 55;

		 * int max = n1;
		 * 
		 * if(n2 > max)
		 * max = n2;
		 * 
		 * if(n3 > max)
		 * max = n2;
		 * 
		 * sysout(max);
		 * 
		 * 4-4.====================================================
		 * 
		 * int max;
		 * max = n1>n2 ? (n1>n3 ? n1 : (n3>n2 ? n3 : n2)) : n2;
		 * 
		 * 
		 * */
		
		
	}

}
