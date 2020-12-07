class ImmutableString {		
	// 메모장 메모 함께 확인 
	public static void main(String[] args) {
		String str1 = "The Best String";
		String str2 = "The Best String";
			
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str1 == str2)	// 참조변수의 참조 값(주소) 비교
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else	
			System.out.println("str1과 str2는 다른 인스턴스 참조");

		if(str3 == str4)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else	
			System.out.println("str1과 str2는 다른 인스턴스 참조");
	
		if(str1.equals(str3))
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else	
			System.out.println("str1과 str2는 다른 인스턴스 참조");
	}

}
