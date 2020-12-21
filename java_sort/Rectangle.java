package java_sort;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	public static Rectangle[] getSortingRec(Rectangle[] recs) {
		
		Rectangle temp = null;
		
		for (int i = 0; i < recs.length; i++) {
			for (int j = 0; j < recs.length - i - 1; j++) {
				
				if (recs[j].getArea() > recs[j + 1].getArea()) {
					temp = recs[j];
					recs[j] = recs[j + 1];
					recs[j + 1] = temp;
				}
			}
		} // 아니면 그냥 Arrays.sort(recs); 메소드 써도 됨.

		return recs;
	}
}
