
public class Practice2_Weight {
	/*
	 * ����ڷκ��� Ű�� �Է¹޾Ƽ�(system.in) ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ� "��ü������, ǥ������, ��ü������"��
	 * �Ǵ��ϴ� ���α׷��� �ۼ��϶�. ǥ�� ü�� ������ ������ ����϶�. [ ǥ��ü�� = ( Ű - 100 ) * 0.9 ]
	 * 
	 */
	private double myHeight;
	private double myWeight;
	private double sWeight;

	public Practice2_Weight(double myHeight, double myWeight) {
		this.myHeight = myHeight;
		this.myWeight = myWeight;
		sWeight = ((myHeight - 100) * 0.9);
		// ������ �����ع����� ������ ������ �ȵ�. Ű�� �����԰� �� 0�� �������ϱ�.
	}

	public void Standard() {
		if (myWeight > sWeight) {
			System.out.println("����� ��ü���Դϴ�.");
		} else if (myWeight == sWeight) {
			System.out.println("����� ǥ�� ü���Դϴ�.");
		} else if (myWeight < sWeight) {
			System.out.println("����� ��ü���Դϴ�.");
		}
	}

}
