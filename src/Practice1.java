
public class Practice1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		//double result = a/b;	 //�� ���, ���� 0.75�� �ƴ� 0.0�� ����.	
		//����: int���� ���������ϱ� ������� int�� �Ҽ��� ���ϴ� �߶����. �ٵ� �� result���� �����ϱ� �翬�� 0������.
		
		double result = (double)a/b; // 1)����� �� ��ȯ, 2)int a, b �� 1�� �̻��� �ڷ����� double�� ����, 3)int a = 3.0;���� ����
		
		System.out.println(result);

	}

}

