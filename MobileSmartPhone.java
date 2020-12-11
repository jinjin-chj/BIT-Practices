package Fri;

class MobilePhone {
	protected String number; // ��ȭ ��ȣ

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

// ���� Ŭ����
class MobileSmartPhone {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-7777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-222-8444", "Iphone");	// ������ ����!! but, �� �ݴ�� �ȵ�. 
		
		ph1.answer(); // ��ȭ�� �޴´�.
		ph1.playApp(); // ���� �����ϰ� �����Ѵ�.
		
		System.out.println();
		
		ph2.answer();
		// ph2.playApp(); //�̰� ������. ��? �θ�Ŭ������ ���� �ڽ�Ŭ�������� ���� ������ �Լ��ϱ�.
	}
}
