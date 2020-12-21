package java_12_21;
/*Apple & 25
 *Orange & 33
 */

class DBox1<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class DDBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}
	@Override
	public String toString() {
		return left + "\n" + right;	// 여기서 left, right는 DBox
	}
}

class DDBoxDemo {

	public static void main(String[] args) {

		DBox1<String, Integer> box1 = new DBox1<>();
		box1.set("Apple", 25);

		DBox1<String, Integer> box2 = new DBox1<>();
		box2.set("Orange", 33);

		DDBox<DBox1<String, Integer>, DBox1<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);
	}

}
