package java_hello;

public class Practice8 {

	public static void main(String[] args) {
		// 1. ������ 3�� ���
		int dan = 3;
		for(int i = 1; i < 10 ; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
		System.out.println('\n');
		
		// 2. 1~ 100�� ���� ���Ͻÿ�
		int sum =0;
		for(int i = 1; i <=100; i++) {
			sum = sum + i;
			
		} System.out.println(sum);
		
		System.out.println('\n');
		
		// 3. ����ǥ
		int kor = 80;
		int math = 80;
		int eng = 60;
		
		int sum1 = (kor + math + eng);
		double avg = ((double)sum1 / 3);
			System.out.println(sum1);
			System.out.println(avg);
		
		if (avg >=90) {
			System.out.println("��");
		} else if (avg >=80) {
			System.out.println("��");
		} else if (avg >=70) {
			System.out.println("��");
		} else if (avg >=60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		

	}

}
