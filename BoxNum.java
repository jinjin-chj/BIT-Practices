package Wed;

class BoxNum {

	public static void main(String[] args) {
		// 인스턴스 배열 대상 for- each문
		Box[] ar = new Box[5];

		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");

		// 배열에서 번호가 505인 박스를 찾아 그 내용을 출력하는 반복문
		for (Box e : ar) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}

	}

}
