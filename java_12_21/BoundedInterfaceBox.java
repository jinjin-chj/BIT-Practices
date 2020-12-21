package java_12_21;

interface Eatable {
	public String eat();
}

class Apple implements Eatable {
	public String toString() {
		return "I am an apple.";
	}

	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Box1<T extends Eatable> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	// �� �� �԰� ��ȯ�ϴ� ������ �޼ҵ�� ����
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}

class BoundedInterfaceBox {
	public static void main(String[] args) {
		Box1<Apple> box = new Box1<>();
		box.set(new Apple());

		Apple ap = box.get();
		System.out.println(ap);
	}
}