package Fri;

class Cake {
	public void yummy() {
		System.out.println("01 Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("02 Yummy Cheese Cake");
	}
}

class StrawberryCheeseCake extends CheeseCake {
	public void yummy() {
		super.yummy();
		System.out.println("03 Yummy Strawberry Cheese Cake");
	}
}

class CakeMain {
	public static void main(String[] args) {
		Cake c1 = new StrawberryCheeseCake();
		CheeseCake c2 = new StrawberryCheeseCake();
		StrawberryCheeseCake c3 = new StrawberryCheeseCake();
		c1.yummy();
		c2.yummy();
	}
}
