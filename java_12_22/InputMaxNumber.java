package java_12_22;

import java.util.ArrayList;

/*2.Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾� �����ϰ� 
�˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�
����(-1�� �Էµ� ������)>> 10 6 22 6 88 77 -1
���� ū ���� 88
 */

import java.util.Scanner;

class InputMaxNumber {

	public static void main(String[] args) {
		int num = 0;
		ArrayList<Integer> list = new ArrayList<>(); // �÷��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);	
		// ��ĳ�� while�� �ȿ� �ְ� �Ǹ� �ٸ� ��� ����
		System.out.print("����(-1�� �Էµ� ������)>> ");
		
		while (num != -1) {
			// ���� �Է¹ް� ����
			num = sc.nextInt();
			
			//if (num == -1) // ���Ϲ� Ż�� �������� ������ �� �����ϳ�
				//break;
			
			list.add(num); // ����ڰ� �Է��ϴ� ���ڵ� �����.
		}

			int maxNum = list.get(0); // �� �� ���� ū ��
			for (int i = 1; i < list.size(); i++) {
				if (maxNum < list.get(i)) 
					maxNum = list.get(i);	
			}
			
			System.out.println("���� ū ���� " + maxNum);
		
	}
}
