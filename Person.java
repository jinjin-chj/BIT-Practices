class Person {		
	// �������� �����ε� ����
	private int regiNum;	//�ֹ� ��ȣ
	private int passNum;	//���� ��ȣ

	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
		
	}
	
	Person(int rnum) {	//�ʱ�ȭ ���� �����ε�
		//regiNum = rnum;
		//passNum = 0; 	// ���� ���� ����� ���� ���� �����ϱ� 0���� �ʱ�ȭ ���ѳ���
		this(rnum, 0);	//�� ������ �̷��� �� ���� ����
	}
	
	void showPersonalInfo() {}
	
}

