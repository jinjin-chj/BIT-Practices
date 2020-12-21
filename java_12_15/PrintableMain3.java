package java_12_15;
						// 메인 따로 만들어야 출력돼.
interface Printable {
	void print(String doc);
}

interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

class SprinterDrinver implements Printable {
	@Override
	public void print(String doc) {
	System.out.println("From Samsung printer");
	System.out.println(doc);
	}
}
class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

class Prn909dRV implements ColorPrintable {
	@Override
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}
}



