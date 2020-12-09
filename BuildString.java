package Tuesday_1208;

public class BuildString {

	public static void main(String[] args) {
		// 문자열 "123"이 저장된 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
// 123
		stbuf.append(45678); 	// 문자열 덧붙이기
		System.out.println(stbuf.toString());	
		//.toString();? stbuf를 스트링객체로 변환
// 12345678
		stbuf.delete(0, 2);	 // 문자열 일부 삭제
		System.out.println(stbuf.toString());
// 345678
		stbuf.replace(0, 3, "AB");	 // 문자열 일부 교체
		System.out.println(stbuf.toString());
// AB678
		stbuf.reverse(); 	// 문자열 내용 뒤집기
		System.out.println(stbuf.toString());
// 876BA
		String sub = stbuf.substring(2, 4); // 일부만 문자열로 반환
		System.out.println(sub);
	}
//6B
}
