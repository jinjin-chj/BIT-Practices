package java_12_14;

class FriendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-3333");
		frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-553-7777");
		frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-549-7555");

		// ��� ��â �� ������ ���� ��ü ���
		for(int i = 0; i <cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}
	}

}
