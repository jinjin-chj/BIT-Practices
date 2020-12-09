package Tuesday_1208;

class PracticeString {

	public static void main(String[] args) {
		/* String 을 이용하여 프로그래밍 하시오.
		입력 : 990925-1012999
		출력 : 990925 1012999
		 */
		
		StringBuilder st = new StringBuilder("990925-1012999");
		st.replace(6, 7, " ");
		System.out.println(st.toString());
	}

}
