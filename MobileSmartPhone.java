package Fri;

class MobilePhone {
	protected String number; // 전화 번호

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

// 메인 클래스
class MobileSmartPhone {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-7777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-222-8444", "Iphone");	// 다형성 적용!! but, 이 반대는 안됨. 
		
		ph1.answer(); // 전화를 받는다.
		ph1.playApp(); // 앱을 선택하고 실행한다.
		
		System.out.println();
		
		ph2.answer();
		// ph2.playApp(); //이건 에러남. 왜? 부모클래스에 없고 자식클래스에서 새로 생성한 함수니까.
	}
}
