/*
탈것: 부모
-필드: 바퀴수, 생성된 탈것의 개수
-생성자: 디폴트 생성자, 바퀴수를 초기화하는 생성자

자전거: 자식
-필드: 바퀴수
-생성자: 바퀴수를 초기화하는 생성자

자동차: 자식
-필드: 바퀴수, 제조사
-생성자: 바퀴수와 제조사를 매개변수로 받아 초기화하는 생성자
*/

class Vehicle{
	int tire;
	static int num;
	
	Vehicle(){
		num++;
	}
	
	Vehicle(int tire){
		this(); // num++; = Vehicle(); = this();
		this.tire = tire;
	}
	
	int Straight(int l){
		return l;
	}
	
	// equals() 메소드 재정의: 바퀴수가 같다면 같은 탈것으로 재정의
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Vehicle) // o가 Vehicle의 일종이라면
			return this.tire == ((Vehicle)obj).tire; // this.tire말고 tire도 돌아가긴 한다!
		else
			return false;
	}
}

class Bike extends Vehicle{
	Bike(int tire){
		super(tire);
	}
}

class Car extends Vehicle{
	String maker;
	
	Car(int tire,String maker){
		super(tire); // Vehicle(tire); = this.tire = tire;
		// 부모클래스의 생성자는 무조건 맨 처음에 불러와야함 !!
		// 따로 this.tire = tire; 해서는 안 되고 부모클래스의 필드이기때문에 부모클래스에서 초기화
		this.maker = maker;
	}
}

class Stone{ // 필드: 부피
	// 생성자: 부피를 매개변수로 받아 초기화하는 생성자
	// 부피가 같은 돌이라면 같은 돌로 간주하도록 equals 메소드 재정의
	
	double volume;
	
	Stone(double volume){
		this.volume = volume;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Stone)
			return this.volume == ((Stone)obj).volume;
		else
			return false;
	}
}

class VehicleTest{
	public static void main(String[] args){
		Vehicle c1 = new Car(4,"가영"); // 탈것 c1은 바퀴 4개인 가영사에서 만든 자동차이다.
		// 업캐스팅: 조상 클래스로 이름 붙여주는 것, 상속 관계가 있을 시에는 항상 가능
		System.out.println(c1.tire);
		System.out.println(((Car)c1).maker); // c1은 탈것만 가리킨다. 따라서 c1에서는 tire만 접근 가능
		// 다운캐스팅: 성립할 수도 안 할수도 있다.
		Car myCar = (Car)c1;
		Bike myBike = (Bike)c1; // 컴파일은 되나 실행할때 예외가 발생
		
		Car c2 = new Car(3,"효정");
		System.out.println(c2.tire);
		System.out.println(c2.maker);
		
		Car c3 = new Car(4,"벤츠");
		Vehicle b1 = new Bike(3);
		Object b2 = new Bike(4);
		Bike b3 = new Bike(2);
		
		System.out.println("이제까지 생성된 탈것 개수: "+Vehicle.num);
		// num은 Test 클래스가 아니라 Vehicle 클래스에 있으므로 Vehicle.num 또는 Car.num 또는 Bike.num
		System.out.println(b1.Straight(30)+"m만큼 직진했습니다.");
		
		System.out.println("c1, b1 비교: "+c1.equals(b1)); // c1, b1 비교
		
		Object o = new Stone(1);
		Stone s = new Stone(1);
		// 돌 s와 b1 자전거 같은지 비교 => false
		System.out.println("s, b1 비교: "+b1.equals(s));
		
		// instanceof 테스트
		System.out.print("물건 돌과 탈것의 비교: ");
		System.out.println(o instanceof Vehicle); // o가 그냥 Object(물건)이기 때문에 컴파일은 가능, false
		System.out.println(o instanceof Stone); // 참
		// System.out.println(s instanceof Vehicle); // s는 돌, 상속관계가 없으면 컴파일 불가
		System.out.println(b1 instanceof Vehicle); // true
		// System.out.println(b1 instanceof Car); // bike와 car는 상속관계가 x
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Car); // 컴파일은 가능, false
		
		System.out.println(o instanceof Stone); // true
		System.out.println(o instanceof Vehicle); // false
		System.out.println(o instanceof Car); // false
		
		System.out.println(b2 instanceof Stone); // false
		
		System.out.println(b3 instanceof Vehicle); // true
		// System.out.println(b3 instanceof Car); // 컴파일 불가
	}
}