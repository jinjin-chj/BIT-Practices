
public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C');	// backspace
		System.out.println("AB" + '\t' + 'C');	// tab 크기만큼 띄어버림, 엔터아님.
		System.out.println("AB" + '\n' + 'C');	// line new : 개행, 이게 엔터.
		System.out.println("ABD" + '\r' + 'C');	// carriage return 커서를 앞으로 옮겨버림. 맨앞자리로 가는건가..
		
	}

}
