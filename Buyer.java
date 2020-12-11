package Fri;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	// 구입한 제품 저장하는 배열
	int i =0;	// 배열에서 사용할 인덱스
	
	void buy(Product p) {	// 얘는 돈 관련 일을 함
		
	}
	void add(Product p) {	// 얘는 장바구니에 담는 일을 함
		
	}
	
	
	void summary() { 	// 영수증이라고 생각함.
		System.out.println("구입한 물건: "+ "add함수 이용 구매한 물품 배열 출력하기" );
		System.out.println("사용한 금액: " + "장바구니 배열에 있는 물품들의 가격의 합");
		System.out.println("남은 금액: " + "처음 1000에서 사용 금액 빼기");
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

