
public class Practice3 {	//비트연산자 &, |, ^, ~ 

	public static void main(String[] args) {
		byte n1 = 13;		//n1= 00001101
		byte n2 = 7;		//n2= 00000111
		byte n3 = (byte)(n1 & n2); //n1 & n2= 00000101  -> n1과 n2중 비트 단위로 같은 부분만 긁어옴. 
		System.out.println(n3);

	}

}
