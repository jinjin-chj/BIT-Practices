package Thurs;
class PointMain03 {
	public static void main(String[] args) {
		
		Point3D p = new Point3D(1, 2, 3);
		// 1,2,3�� ���� x, y, z���� ��.		
		System.out.println(p.toString() + "�Դϴ�.");		
		
		p.moveUp(); // z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");		
		
		p.moveDown(); // z ������ �Ʒ��� �̵�	
		p.move(10, 10); // x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");	
		
		p.move(100, 200, 300); // x, y, z������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
	}
}
/*==============================
"(1,2,3) �� ��"�Դϴ�.
"(1,2,4) �� ��"�Դϴ�.
"(10,10,3) �� ��"�Դϴ�.
"(100,200,300) �� ��"�Դϴ�.
 * */
