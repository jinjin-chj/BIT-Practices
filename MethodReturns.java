package java_hello;

public class MethodReturns {

	public static void main(String[] args) {	// ����� �̰ž�! ��� �����ְ� �ؿ��� ���� �Լ� ���� // void:������ ���� ����!!
		int result;
		result = adder(4,5);	//adder��� �Լ� ȣ��(���) // adder�� ��ȯ�ϴ� ���� result�� ����
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));	//square�Լ� ȣ��
	}
	
	public static int adder(int num1, int num2) {		//adder�Լ� ���� // ���� ���� ������! int sth
		int addResult = num1 + num2;
		return addResult;		//addResult�� ���� ��ȯ
	}
	
	public static double square(double num) {		// square�Լ� ����
		return num * num ;		//num*num�� ����� ��ȯ
	}
}
