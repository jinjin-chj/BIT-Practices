package Fri;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품 저장하는 배열
	int i = 0; // 배열에서 사용할 인덱스

	void buy(Product p) { // 얘는 돈 관련 일을 함
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "를 살 수 없습니다.");
			return;
		} else {
			money -= p.price;
			add(p);
		}
	}

	void add(Product p) { // 얘는 장바구니에 담는 일을 함
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, cart.length); // 새로운 배열 복사 arraycopy!!
			cart = newCart; // 뉴카트로 초기화
		}
		cart[i] = p;
		i++;
	}

	void summary() { // 영수증이라고 생각함.
		int sum = 0; // 초기화

		System.out.print("구입한 물건: ");
		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ", ");
			sum += cart[i].price;
		}

		System.out.println();
		System.out.println("사용한 금액: " + sum);

		System.out.println("남은 금액: " + money); // 남은금액 뭘로 불러오지 ??
	}
}

class Product { // 물품의 부모 클래스
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}

}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}

}
