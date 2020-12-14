package java_12_14;

class PrintableMain2 {
	public static void main(String[] args) {
		// �Ｚ ���� ������ �������̽� �����
		String myDoc = "This is a report about...";

		// �Ｚ �����ͷ� ���
		Printable2 prn = new SPrinterDriver2();
		prn.print(myDoc);
		System.out.println();

		// LG �����ͷ� ���
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