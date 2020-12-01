
public class RE_Circle {
	double radious;

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	public double getArea() {
		final double PI = 3.14;
		return radious * radious * PI;
	}
	
}