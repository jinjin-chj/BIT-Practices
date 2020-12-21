package java_12_17;

public class Circle {
	
	private int x, y, rad;

	public Circle(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.x == ((Circle) obj).x && this.y == ((Circle) obj).y)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return ("Circle(" + x + "," + y + ")" + "¹ÝÁö¸§" + rad);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

}
