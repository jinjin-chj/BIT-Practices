package java_12_14;

class PrintableMain2 {
	public static void main(String[] args) {
		// 삼성 엘지 프린터 인터페이스 만들기
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable2 prn = new SPrinterDriver2();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver2();
		prn.print(myDoc);
	}
}

interface Printable2 {
	public void print(String doc);
}

class SPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}