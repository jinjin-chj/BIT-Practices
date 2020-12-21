package java_12_16;

abstract class Fruit {
	protected abstract void print();
}

class Grape extends Fruit {

	@Override
	protected void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit {

	@Override
	protected void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit {

	@Override
	protected void print() {
		System.out.println("나는 배이다.");
	}
}

public class FruitMain {

	public static void main(String[] args) {
		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };

		for (Fruit f : fAry)

			f.print();

	}
}
