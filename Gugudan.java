/* 
Gugudan gugudan = new Gugudan();
gugudan.printGugu(10);  //1�ܺ��� 10�ܱ��� ���
gugudan.printGugu(n);  //1�ܺ��� n�ܱ��� ���
*/
public class Gugudan {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int printGugu() {
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j <10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}	
		}
		return num;
		
	}
}
