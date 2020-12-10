package Thurs;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public String toString() {
		//String tmp;
		//tmp = (getColor() + "색의 " + "(" + getX() + "," + getY() + ")의 점");
		//return tmp;
		System.out.print(getColor() + "색의 " + "(" + getX() + "," + getY() + ")의 점");
		return"";
	}

}
