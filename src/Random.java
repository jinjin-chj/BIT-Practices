
public class Random {

	public static void main(String[] args) {
		// 5. 1~6까지의 임의의 정수를 뽑아서 몇 번이 나왔는지 맞추는 게임 ----> 난수 뽑기
		int num = (int)(Math.random() * 6) + 1;		//6까지만 있으면 0~5, + 1;은 시작값. 1~6으로 변경됨
			System.out.println(num + "번 입니다.");

	}

}
