package java_12_17;

// 접근 수준 지시자를 protected에서 public으로 바꾸기 위한 메소드 오버라이딩
class Point1 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point1(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // 오브젝 클래스의 클론메소드 호출
	}
}

class InstanceCloning {
	public static void main(String[] args) {

		Point1 org = new Point1(3, 5);
		Point1 cpy;

		try {
			cpy = (Point1) org.clone();
			org.showPosition();
			cpy.showPosition();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}