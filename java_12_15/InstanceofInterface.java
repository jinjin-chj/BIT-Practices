package java_12_15;

interface Printable4 {
	void printLine(String str)	;
}

class SimplePrinter implements Printable4 {
	public void printLine(String str) {
		System.out.println(str);
	}
}
class MultiPrinter extends SimplePrinter {
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi...");
	}
}

class InstanceofInterface {
	public static void main(String[] args) {
		Printable4 prn1 = new SimplePrinter();
		Printable4 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable4)
			prn1.printLine("This is a simple printer.");
		System.out.println();
	
		if(prn2 instanceof Printable4)
			prn1.printLine("This is a multiful printer.");
	}
}
