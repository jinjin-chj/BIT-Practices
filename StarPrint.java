
public class StarPrint {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int printTriangle() {
		for(int i = 1; i <=num; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();	
			}
		return num;
	}
		
	public int printReverseTriangle() {
		for(int i = num; i > 0; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		return num;
	}
					
}
