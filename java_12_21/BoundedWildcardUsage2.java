package java_12_21;

class Box2<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class Toy {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	public static void outBox(Box2<? extends Toy> box) {
		Toy t = box.get(); // �ڽ����� ������
		System.out.println(t);
	}

	public static void inBox(Box2<? super Toy> box, Toy n) {
		box.set(n); // �ڽ��� �ֱ�
	}
}

class BoundedWildcardUsage2 {
	public static void main(String[] args) {
		
		Box2<Toy> box = new Box2<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
