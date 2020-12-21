package java_12_21;

class BoxHW<T> {

	private T ob;

	public T get() {
		return ob;
	}

	public void set(T ob) {
		this.ob = ob;
	}
}

public class BoxHWMain {

	private static <T> void swapBox(BoxHW<T> box1, BoxHW<T> box2) {
		T tmp = box1.get();
		box1.set(box2.get());
		box2.set(tmp);
	}

	public static void main(String[] args) {
		BoxHW<Integer> box1 = new BoxHW<>();
		box1.set(99);

		BoxHW<Integer> box2 = new BoxHW<>();
		box2.set(55);

		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
	}

}
