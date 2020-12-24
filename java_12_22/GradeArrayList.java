package java_12_22;

import java.util.ArrayList;
import java.util.Scanner;

/*
6.Scanner Ŭ������ ����Ͽ� 6�� ����('A','B','C','D','F')�� ���ڷ� �Է¹޾� 
ArrayList�� �����ϰ�, ArrayList�� �˻��Ͽ� 
������ ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ� "���" ���.
6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> A C A B F D
	2.3333333333333335
 */
class GradeArrayList {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");

		for (int i = 0; i < 6; i++) { // �� ���� �Է��ϵ� �� 6���� �ްڴ�.
			char ch = sc.next().charAt(0);
			list.add(ch); // ����ڰ� �Է��� ���� 6�� ����.
		}

		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i);

			switch (ch) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}

		double avg = sum / list.size();
		System.out.println(avg);
	}
}
