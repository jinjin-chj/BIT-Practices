/*
 2~100 ���̿� �ִ� ��� �Ҽ��� ã�� ���α׷��� �ۼ��϶�. 
 �־��� ���� k�� 2���� k-1������ ���ڷ� ����� 
 �������� 0�� ���� �ϳ��� ������ �Ҽ��� �ƴϴ�.
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
