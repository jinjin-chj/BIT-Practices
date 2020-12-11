package Fri;

class TV1 {
	private int size;

	public TV1(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV1 {
	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printproterty() {
		System.out.println(super.getSize() + "인치 " +color+"컬러");
	}
}

