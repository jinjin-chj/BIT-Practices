package Wed;

class Box {
	private int boxNum;
	private String contents;

	Box(int boxNum, String contents) {
		this.boxNum = boxNum;
		this.contents = contents;
	}

	public int getBoxNum() {

		return boxNum;
	}

	public String toString() {
		// �̰� �߰� �� �ϸ� �̻��� ���� ����
		return contents;
	}
}
