
public class DupRef {

	public static void main(String[] args) {
		// 그림판 그림 확인하기!!
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;	//걍 같다고 생각해
		
		// 각 인스턴스를 대상으로 예금 진행
		ref1.deposit(3000);
		ref2.deposit(2000);
		
		// 각 인스턴스를 대상으로 출금 진행
		ref1.withdraw(400);
		ref2.withdraw(300);
		
		// 각 인스턴스를 대상으로 잔액 조회
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}

}
