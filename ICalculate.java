package java_12_14;

public interface ICalculate {

	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);

}
/*
 * Calculator 클래스 구현 CalMain에서 Calculator테스트 하는 프로그램을 작성하시오.
 */

class Calculator implements ICalculate {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		return x / y;
	}
}
