
public class SrarPrintMain {

	public static void main(String[] args) {
		StarPrint starprint = new StarPrint();
		starprint.setNum(3);
		starprint.setNum(5);
		
		System.out.print(starprint.printTriangle());
		System.out.println();
		System.out.print(starprint.printReverseTriangle());

	}

}
