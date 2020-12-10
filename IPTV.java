package Thurs;

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는 " + address + " 주소의 " + super.getSize() + "인치 " + color + "컬러");
		
		/*System.out.print("나의 IPTV는 " + address + " 주소의 " );
		 * super.printProperty(); //이렇게 두 줄로 나눠도 되고 위에처럼 직접 호출해도 됨.
		 * */
	}	
}
