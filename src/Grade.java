
public class Grade {

	public static void main(String[] args) {
		/*
		 * ����: 80, ����: 80, ����: 60
		 * ������ ��� ���, ��տ� ���� ����̾簡 ���
		 */
		
		int kor = 80;
		int math = 80;
		int eng = 60;
		
		
		int sum = (kor + math + eng);
		double avg = ((double)sum / 3);		// �� �� ��԰� Ʋ��!!!!!!!!!!!! �׳� �����ϸ� �Ҽ��� ���� �� ����!!!
		//double avg = (sum / 3.0);  // ���2
			System.out.println("����: " + sum);
			System.out.println("���: " + avg);
				
		if (avg >= 90) {
			System.out.println("����: ��");
			
		} else if ((avg < 90) && (avg >= 80)) {		// && ���� 80�̻�, 70�̻�, 60�̻� �̷��� �ص� ��!!
			System.out.println("����: ��");
			
		} else if ((avg < 80) && (avg >= 70)) {
			System.out.println("����: ��");
			
		} else if ((avg < 70) && (avg >= 60)) {
			System.out.println("����: ��");
			
		} else  		// �������� else if �ƴ�, else!!�ְ� ���� ���ֱ�!!!
			System.out.println("����: ��");
			
			
	}

}
