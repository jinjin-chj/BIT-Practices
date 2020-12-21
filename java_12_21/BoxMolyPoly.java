package java_12_21;

/* 24
 * Poly
 */
class Box5<T> {

	private T ob;

	public T get() {
		return ob;
	}

	public void set(T ob) {
		this.ob = ob;
	}

}

class BoxMolyPoly {

	private static <T> boolean compBox(Box5<T> box, T o) {
		T check = box.get();

		return check.equals(o);

	}

	public static void main(String[] args) {

		Box5<Integer> box1 = new Box5<>();
		box1.set(24);

		Box5<String> box2 = new Box5<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");

		if (compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}
