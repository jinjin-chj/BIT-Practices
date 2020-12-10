/*[2번] 다음 main() 메소드와 실행 결과를 참고하여 
 * ColorTV를 상속받는 IPTV 클래스를 작성하라.

public static void main(String[] args) {
   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
   //"192.1.1.2" 주소에 32인치, 2048컬러
   iptv.printProperty();
}
=============================================
나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
 * 
 */
package Thurs;
public class IPTVMain {
	public static void main(String[] args) {
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		   //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();
		}

}
