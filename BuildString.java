package Tuesday_1208;

public class BuildString {

	public static void main(String[] args) {
		// ���ڿ� "123"�� ����� �ν��Ͻ��� ����
		StringBuilder stbuf = new StringBuilder("123");
// 123
		stbuf.append(45678); 	// ���ڿ� �����̱�
		System.out.println(stbuf.toString());	
		//.toString();? stbuf�� ��Ʈ����ü�� ��ȯ
// 12345678
		stbuf.delete(0, 2);	 // ���ڿ� �Ϻ� ����
		System.out.println(stbuf.toString());
// 345678
		stbuf.replace(0, 3, "AB");	 // ���ڿ� �Ϻ� ��ü
		System.out.println(stbuf.toString());
// AB678
		stbuf.reverse(); 	// ���ڿ� ���� ������
		System.out.println(stbuf.toString());
// 876BA
		String sub = stbuf.substring(2, 4); // �Ϻθ� ���ڿ��� ��ȯ
		System.out.println(sub);
	}
//6B
}
