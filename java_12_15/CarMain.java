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
		System.out.println("시동 걸기 부릉-");
	}

	@Override
	public void stop() {
		System.out.println("제동 걸기 끼익-");
	}

}

public class CarMain {
	public static void main(String[] args) {
		Car car = new Genesis(); // 폴리몰티즘 적용
		car.run();

	}

}
