class ImmutableString {		
	// �޸��� �޸� �Բ� Ȯ�� 
	public static void main(String[] args) {
		String str1 = "The Best String";
		String str2 = "The Best String";
			
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str1 == str2)	// ���������� ���� ��(�ּ�) ��
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else	
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");

		if(str3 == str4)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else	
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
	
		if(str1.equals(str3))
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else	
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
	}

}
