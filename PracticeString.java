package Tuesday_1208;

class PracticeString {

	public static void main(String[] args) {
		/* String �� �̿��Ͽ� ���α׷��� �Ͻÿ�.
		�Է� : 990925-1012999
		��� : 990925 1012999
		 */
		
		StringBuilder st = new StringBuilder("990925-1012999");
		st.replace(6, 7, " ");
		System.out.println(st.toString());
	}

}
