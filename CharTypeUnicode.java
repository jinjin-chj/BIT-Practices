
public class CharTypeUnicode {

	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;		// 문자 '헐'의 유니코드 값(10진수) / 인코딩 필요 없이 바로 집어넣기
		char ch4 = 54869;		// 문자 '확'의 유니코드 값
		char ch5 = 0xD5D0;		// 문자 '헐'의 유니코드 값(16진수)
		char ch6 = 0xD655;
		
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
	
	}

}
