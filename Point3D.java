package Thurs;

class Point3D extends Point {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;

	}

	public void moveUp() {
		this.z = (z + 1);
	}

	public void moveDown() {
		this.z = (z - 1);

	}

	public String toString() {
		String tmp;
		tmp = ("(" + getX() + "," + getY() + "," + getZ() + ")ÀÇ Á¡");
		return tmp;
	}

}
