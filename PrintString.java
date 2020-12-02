
public class PrintString {

	public static void main(String[] args) {
		String str1 = "Happy";		// ¹®ÀÚ¿­
		String str2 = "Birthday";
		
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);
		
	}
	
	public static void printString(String str) {
		System.out.print(str);
		
	}

}
