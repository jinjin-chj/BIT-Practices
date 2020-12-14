package java_12_14;

public interface ICalculate {

	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);

}
/*
 * Calculator Ŭ���� ���� CalMain���� Calculator�׽�Ʈ �ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
