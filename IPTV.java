package Thurs;

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print("���� IPTV�� " + address + " �ּ��� " + super.getSize() + "��ġ " + color + "�÷�");
		
		/*System.out.print("���� IPTV�� " + address + " �ּ��� " );
		 * super.printProperty(); //�̷��� �� �ٷ� ������ �ǰ� ����ó�� ���� ȣ���ص� ��.
		 * */
	}	
}
