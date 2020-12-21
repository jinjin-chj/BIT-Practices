package java_12_21;
class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class BoxInBox {
	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		sBox.set("I am so sleepy.");

		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);

		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);

		System.out.println(zBox.get().get().get());
	}
}
