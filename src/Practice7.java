
public class Practice7 {		// 이것도 다시 하기 ㅡㅡ

	public static void main(String[] args) {
		// 영희가 은행에 500원을 입금함.
		// 하루에 이자가 1원씩.
		// 5일 뒤 잔액은 얼마?
		
		int balance = 500;	//잔액
		int b = 0;	//일자(하루)
		
		for(int i = 1; i <= 5; i++) {
			b = balance + i;
		}
		System.out.println("잔액은 " + b + "원 입니다.");

	}

}
