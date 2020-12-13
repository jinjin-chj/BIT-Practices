class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	// 구입한 제품 저장하는 배열
	int i =0;	// 배열에서 사용할 인덱스
	
	void buy(Product p) {	// 얘는 돈 관련 일을 함
		if(money< p.price) {
			System.out.println("잔액 부족");
			return;
		} else (money >= p.price) {
			money -= p.price;
			add(p);
		}
		
	}
	void add(Product p) {	// 얘는 장바구니에 담는 일을 함
		if( i >= cart) {
			Product[] newCart = new Product[cart.length *2];
			// 새로운 배열 복사 모르겠음
			
		}
		cart = newCart;	//뉴카트로 초기화
		
		cart[i] = p.product;
		i++;
	}
	
	
	void summary() { 	// 영수증이라고 생각함.
		int sum = 0;	//초기화
	
		System.out.print("구입한 물건: ");
		for(int i =0; i< cart.length; i++) {
			System.out.println(cart[i] + ", ");
		}
		sum += cart.price;
		
		System.out.print("사용한 금액: " + sum);
		
		System.out.println("남은 금액: " + );	//남은금액 뭘로 불러오지 ??
	}	
}

class Product {	// 물품의 부모 클래스
	int price;
	Product(int price) {
		this.price= price;
	}
}
class Tv extends Product {
	Tv() {super(100);}
	
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() {
		return "Computer";
	}
	
}
class Audio extends Product {
	Audio() {super(50);}
	
	public String toString() {
		return "Audio";
	}
	
}

// 메인클래스
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
