/*���� TV Ŭ������ �ִ�.

class TV{
   private int size;
   public TV(int size) { this.size = size; }
   protected int getSize() { return size; }
}

[1��] ���� main() �޼ҵ�� ���� ����� �����Ͽ� 
TV�� ��ӹ��� ColorTV Ŭ������ �ۼ��϶�.
public static void main(String[] args) {
   ColorTV myTV = new ColorTV(32, 1024);
   myTV.printProperty();
}
===========
32��ġ 1024�÷�
 */


package Thurs;

public class TVMain {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		}

}
