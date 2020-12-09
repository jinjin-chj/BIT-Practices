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
		// 이거 추가 안 하면 이상한 숫자 나옴
		return contents;
	}
}
