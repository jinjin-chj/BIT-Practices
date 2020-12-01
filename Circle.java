
public class Circle {

	double rad;	//  Alt + Shift + S -> R 누르면 게터세터 함수
		
	public double getRadious() {		//getter.setter함수
		return rad;
	}
		
	public void setRadious(int rad) {
		this.rad = rad;
	}
		
	public double getArea() {
		final double PI = 3.14;
		return rad * rad * PI;
	} 

}
