package java_hello;

public class Review {

	public static void main(String[] args) {
		/*
		// 1. ������ ��������
		for(int i =2; i <10; i++) {
			for(int j =1; j<10; j++) {
				System.out.println(i + " x " + j +" = " + (i*j));
			}
		}
		
		// 2. ���� ���α׷�
		 * 
		int kor = 90;
		int math = 70;
		int eng = 85;
		
		int sum = (kor + math + eng);
		double avg = sum / 3.0;
		System.out.println("����: " +sum);
		System.out.println("���: " +avg);
		
		if(avg >= 90) {
			System.out.println("����: ��");
		} else if(avg>=80) {
			System.out.println("����: ��");
		} else if(avg>=70) {
			System.out.println("����: ��");
		} else if(avg>=60) {
			System.out.println("����: ��");
		} else 
			System.out.println("����: ��");
		
		
		//3. 5x5�����
		for(int i=1; i <=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//4.���ﰢ�� �����
		for(int i=1; i <=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5.�� ������ �ﰢ��
		for(int i=5; i >0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//6. ���������Ļﰢ�� (�ٽ��غ���, �ٸ� ��� Ȯ���غ���-������������)
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j >= i; j--) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
