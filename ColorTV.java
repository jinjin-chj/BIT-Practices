package Thurs;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {	
		// protected ������ �ڽ� Ŭ�������� ���������!!
		return size;
	}
}

class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");
						// �Ǵ� super.getSize() �� ����
	}
}
