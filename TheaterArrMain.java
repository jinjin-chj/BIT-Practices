/*배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자.
아주 작은 극장이라서 좌석이 10개 밖에 되지 않는다.
-> int[10], 0~9까지 숫자 출력
사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다.
-> 스캐너, 키보드 입력받기 
즉, 예약이 끝난 좌석은 1로, 예약이 되지 않은 좌석은 0으로 나타낸다.
-> 사용자의 입력값을 배열에 저장해서-> 배열 부분 교체
*/
package Thurs;

class TheaterArrMain {
	public static void main(String[] args) {
		TheaterArr arr = new TheaterArr();
		arr.run();

	}

}
