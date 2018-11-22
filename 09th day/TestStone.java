class Stone /*extends Object*/{
	int volume;
	
	Stone(){}
	Stone(int volume){
		this.volume = volume;
	}
	
	void printName(){
		System.out.println(this.getClass().getName());
	}
	
	@Override
	public String toString(){ // 객체의 정보를 문자열로 반환
	// 원래 toString은 public이므로 모두가 쓸 수 있는데 붙이지 않으면 같은 패키지에서만 쓸 수 있음
	// 접근지시자는 마음대로 줄일 수 없으므로 public붙이지 않으면 오류가 뜸, 넓힐 수는 있음
		return "돌";
	}
	
	@Override
	public boolean equals(Object obj){ // 이 객체와 obj가 일치하면 true, 아니라면 false
		// 재정의: 부피가 같으면 같은 돌로 인정
		return this.volume == ((Stone)obj).volume; // Object에 메소드는 있지만 필드는 없다.
	}
}

class TestStone{
	public static void main(String[] args){
		/*
		Stone dole = new Stone();
		dole.printName();
		System.out.println(dole.toString()); // Object 클래스(돌의 조상)에 toString() 메소드가 존재하기 때문에 호출가능
		*/
		
		Stone s1 = new Stone(3);
		Stone s2 = new Stone(5);
		Stone s3 = new Stone(3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}