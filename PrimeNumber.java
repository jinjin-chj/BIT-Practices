/*
 2~100 사이에 있는 모든 소수를 찾는 프로그램을 작성하라. 
 주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 
 나머지가 0인 것이 하나라도 있으면 소수가 아니다.
 * 
 */
class PrimeNumber {
	public int findprime() {
		int answer = 0;

		for (int i = 2; i <= 100; i++) {
			boolean check = true;
			for (int j = 2; j * i <= i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				answer++;
			}
		}
		return answer;
	}

}
