// 자전거 클래스
// 필드: 바퀴수
// 생성자: 바퀴수를 매개변수로 받아 필드 바퀴수를 초기화
// Object 클래스의 toString() 메소드 재정의: 바퀴수 정보를 반환하도록 재정의
// Object 클래스의 equals() 메소드 재정의: 바퀴수가 같으면 같은 자전거로 인식하도록재정의

// 두발자전기 2대, 네발자전거 1대 생성해서 toString(), equals() 메소드 테스트

class Bicycle{
	int tire;
	
	Bicycle(int tire){
		this.tire = tire;
	}
	
	@Override
	public String toString(){
		return "바퀴 수: "+tire+"개";
	}
	
	@Override
	public boolean equals(Object obj){
		return this.tire == ((Bicycle)obj).tire;
	}
}

class BicycleTest{
	public static void main(String[] args){
		Bicycle b1 = new Bicycle(2);
		Bicycle b2 = new Bicycle(2);
		Bicycle b3 = new Bicycle(4);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}
}