
public class Practice3 {	//��Ʈ������ &, |, ^, ~ 

	public static void main(String[] args) {
		byte n1 = 13;		//n1= 00001101
		byte n2 = 7;		//n2= 00000111
		byte n3 = (byte)(n1 & n2); //n1 & n2= 00000101  -> n1�� n2�� ��Ʈ ������ ���� �κи� �ܾ��. 
		System.out.println(n3);

	}

}
