package java_12_16;

abstract class Fruit {
	protected abstract void print();
}

class Grape extends Fruit {

	@Override
	protected void print() {
		System.out.println("���� �����̴�.");
	}
}

class Apple extends Fruit {

	@Override
	protected void print() {
		System.out.println("���� ����̴�.");
	}
}

class Pear extends Fruit {

	@Override
	protected void print() {
		System.out.println("���� ���̴�.");
	}
}

public class FruitMain {

	public static void main(String[] args) {
		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };

		for (Fruit f : fAry)

			f.print();

	}
}
