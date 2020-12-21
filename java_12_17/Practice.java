package java_12_17;

/*10. 다음 조건을 만족하는 클래스 String의 객체 이용 프로그램을 작성하여 
	메소드 equals()와 연산자 ==의 차이를 비교 설명하시오.(필수) 
- 메소드 equals()와 비교 연산자 ==의 차이를 다음 소스로 점검
 */
public class Practice {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;

		System.out.println(s1 == s2); // 같지 않다
		System.out.println(s1.equals(s2)); // 같다
		System.out.println(s2 == s3); // 같다
		System.out.println(s2.equals(s3)); // 같다

	}

}
