package java_12_15;

interface Upper {}
interface Lower {}

interface Printable5 {
	String getContents();
	
}

class Report implements Printable5, Upper {
	String cons;
	
	Report(String cons) {
		this.cons = cons;
	}
	public String getContents() {
		return cons;
	}
}
class Printer {
	public void printContents(Printable5 doc) {
		if(doc instanceof Upper) {
			System.out.println((doc.getContents()).toUpperCase());
		}
		else if(doc instanceof Lower) {
			System.out.println((doc.getContents()).toLowerCase());
		}
		else
			System.out.println(doc.getContents());
		
	}
}