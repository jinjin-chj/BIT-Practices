package Fri;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());		// �̷��� ��ٱ��Ͽ� ��ƺ��ڴٴ°���.
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
