
public class Circle {

	double rad;	//  Alt + Shift + S -> R ������ ���ͼ��� �Լ�
		
	public double getRadious() {		//getter.setter�Լ�
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
