
public class CompAssignOp {

	public static void main(String[] args) {
		
		short num = 10;
		num = (short)(num + 77L);	// �� ��ȯ ���ϸ� ������ ���� �߻�/ Why? num�� long���� �ƴµ� short�� �������� �ϴϱ� ����.
		int rate = 3;
		rate = (int)(rate * 3.5);	// �� ��ȯ ���ϸ� ������ ���� �߻�/ Why? num�� double���� �ƴµ�~ / ���⼭ 3.5�� ���ͷ�
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;		//�� ��ȯ �ʿ� ���� /Why? ���� ���� ������!!!�� �� ��ȯ �ʿ�
		rate = 3;
		rate *= 3.5;	//�� ��ȯ �ʿ� ����
		System.out.println(num);
		System.out.println(rate);
		
	}

}
