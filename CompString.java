package Tuesday_1208;

public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;

		if (st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");

		cmp = st1.compareTo(st2);
		if (cmp == 0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		else if (cmp < 0)
			System.out.println("������ �տ� ��ġ�ϴ� ����: " + st1);
		else
			System.out.println("������ �տ� ��ġ�ϴ� ����: " + st2);

		if (st1.compareToIgnoreCase(st2) == 0)	//��ҹ��� ����
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
	}

}
