package java_12_21;

interface Getable<T> {
	public T get();
}

class Box4<T> implements Getable<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	@Override
	public T get() {
		return ob;
	}
}

class Toy1 {
	@Override
	public String toString() {
		return "I am a Toy..";
	}
}

public class GetableMain {

	public static void main(String[] args) {
		Box4<Toy1> box = new Box4<>();
		box.set(new Toy1());

		Getable<Toy1> gt = box;
		System.out.println(gt.get());
	}

}
