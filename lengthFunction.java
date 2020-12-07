
public class lengthFunction {

	public static void main(String[] args) {

		String str1 = new String("Simple String");
		String str2 = "The Best String";

		System.out.println(str1);
		System.out.println(str1.length());	// length()는 공백 포함 글자수
		System.out.println();

		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();

		showString("Funny String");		//함수 써먹었으니까 아래에서 함수 만들어줌
	}

	public static void showString(String str) {

		System.out.println(str);
		System.out.println(str.length());

	}

}
