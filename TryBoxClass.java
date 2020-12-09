package Wed;

public class TryBoxClass {
	private int num;
	private String contents;
	
	TryBoxClass(int num, String contents){
		this.num = num;
		this.contents = contents;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String toString() {
		return contents;
	}
	
	
}
