
public class DupRef {

	public static void main(String[] args) {
		// �׸��� �׸� Ȯ���ϱ�!!
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;	//�� ���ٰ� ������
		
		// �� �ν��Ͻ��� ������� ���� ����
		ref1.deposit(3000);
		ref2.deposit(2000);
		
		// �� �ν��Ͻ��� ������� ��� ����
		ref1.withdraw(400);
		ref2.withdraw(300);
		
		// �� �ν��Ͻ��� ������� �ܾ� ��ȸ
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}

}
