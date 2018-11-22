// 필드: 객체마다 개별적으로 저장
// 객체들끼리 공유하는 필드: static
// 메소드: 객체들끼리 공유: 클래스별로 하나의 코드 공유
// static method: 모든 객체들이 똑같은 결과를 출력할 경우 static으로 작성

// 자동차 클래스
// 생성자: 색상, 연식 초기화하는 생성자
// 이제까지 생산된 자동차 대수 저장하는 변수

// 메인메소드
// 자동차 몇대 생성후 이제까지 생성된 자동차 몇대인지 출력

class Car{
	String color;
	int year;
	static int numOfCar; // 모든 객체들이 공유, 필드는 초기화하지 않아도 자동으로 0
	
	// 색상 출력하는 메소드
	void printColor(){ // 결과가 객체마다 다르기때문에 static x
		System.out.println("이 자동차의 색상은 "+this.color+"입니다.");
	}
	
	/*
	static void m1(){ // static 메소드에서는 non-static 멤버 사용 불가 non-static에서 static은 가능
		System.out.println("연식: "+year);
	}
	*/
	// main 메소드가 static일때 main안에서 static만 호출 가능 하므로 다른 메소드에 다 static붙임
	
	// 이제까지 생산된 자동차 대수 출력하는 메소드
	static void printNumOfCar(){
		System.out.println("이제까지 생산된 자동차: "+numOfCar);
		// 만약 this.numOfCar로 하면 컴파일x static은 객체가 없는 상황에서도 호출가능한데 this는 객체를 가리킴
	}
	
	Car(String color,int year){
		this.color = color;
		if(year<1900 || year>2018) this.year = 2018;
		else this.year = year;
		numOfCar++;
	}
}

class NumOfCarTest{
	public static void main(String[] args){
		// static 변수는 클래스 이름으로 접근
		System.out.println("이제까지 생산된 자동차: "+Car.numOfCar);
		Car.printNumOfCar();
		
		// 객체들의 배열
		Car[] myCars = new Car[10]; // 이 배열은 자동차 10대 저장 가능
		// int[] arr = new int[10];
		
		myCars[0] = new Car("black",2010);
		myCars[0].printColor();
		System.out.println("이제까지 생산된 자동차: "+Car.numOfCar);
		
		myCars[1] = new Car("red",1915);
		myCars[2] = new Car("mint",2018);
		myCars[2].printNumOfCar();
		myCars[3] = new Car("indi pink",2017);
		myCars[3].printColor();
		myCars[4] = new Car("ruby",5000);
		Car.printNumOfCar();
		myCars[4].printNumOfCar();
	}
}