package java_hello;

public class GetGrade {	//�� ����, ģ�� �����̶� ���غ���!! ��� �ῴ�� !!! 

	public static void main(String[] args) {
		
		int kor = 70;
		int math = 65;
		int eng = 80;
		
		int total = (kor + math + eng);
		double avg = total / 3.0;
	
		System.out.println("����� ������ " + getGrade(avg) + "�Դϴ�.");
	}
	
	public static char getGrade(double avg) {
		char ch;	//char�� return���� ���� �ֱ�(����)
		
		if(avg >= 90) {
			ch= '��';			
		} else if(avg>=80) {
			ch= '��';
		} else if(avg>=70) {
			ch= '��';
		} else if(avg>=60) {
			ch= '��';
		} else 
			ch= '��';
		
		return ch;
		
		
	}
}
