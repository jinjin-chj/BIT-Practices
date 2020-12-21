package java_12_15;

abstract class Car {
	
	public abstract void start();
	public abstract void stop();
	
	final public void run() {
		start();
		stop();
	}
}

class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("�õ� �ɱ� �θ�-");
	}

	@Override
	public void stop() {
		System.out.println("���� �ɱ� ����-");
	}

}

public class CarMain {
	public static void main(String[] args) {
		Car car = new Genesis(); // ������Ƽ�� ����
		car.run();

	}

}
