class Person {		
	// 생성자의 오버로딩 예시
	private int regiNum;	//주민 번호
	private int passNum;	//여권 번호

	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
		
	}
	
	Person(int rnum) {	//초기화 목적 오버로딩
		//regiNum = rnum;
		//passNum = 0; 	// 여권 없는 사람이 있을 수도 있으니까 0으로 초기화 시켜놓음
		this(rnum, 0);	//위 두줄을 이렇게 쓸 수도 있음
	}
	
	void showPersonalInfo() {}
	
}

