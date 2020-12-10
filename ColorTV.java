package Thurs;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {	
		// protected 이유는 자식 클래스에서 써먹으려고!!
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
		System.out.println(getSize() + "인치 " + color + "컬러");
						// 또는 super.getSize() 도 가능
	}
}
