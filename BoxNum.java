package Wed;

class BoxNum {

	public static void main(String[] args) {
		// �ν��Ͻ� �迭 ��� for- each��
		Box[] ar = new Box[5];

		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");

		// �迭���� ��ȣ�� 505�� �ڽ��� ã�� �� ������ ����ϴ� �ݺ���
		for (Box e : ar) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}

	}

}
