
public class BankAccount00 {

	public static void main(String[] args) {
		// �� ���� �ν��Ͻ� ����
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// �� �ν��Ͻ��� ������� ���� ����
		yoon.deposit(5000);
		park.deposit(3000);
		
		// �� �ν��Ͻ��� ������� ��� ����
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// �� �ν��Ͻ��� ������� �ܾ� ��ȸ
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
