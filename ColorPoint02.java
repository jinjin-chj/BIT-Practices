package Thurs;

class ColorPoint02 extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint02(int x, int y) {
		super(x, y);
	}

	public ColorPoint02() {
		super(0, 0);
		this.color = "BLACK";

	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public String toString() {
		String tmp;
		tmp = (getColor() + "색의 " + "(" + getX() + "," + getY() + ")의 점");
		return tmp;
	}

}
