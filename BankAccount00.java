
public class BankAccount00 {

	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금 진행
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 출금 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// 각 인스턴스를 대상으로 잔액 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}
