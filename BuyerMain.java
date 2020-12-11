package Fri;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());		// 이렇게 장바구니에 담아보겠다는거지.
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
