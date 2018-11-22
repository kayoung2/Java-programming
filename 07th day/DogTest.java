class Dog{
	private int age;
	private String name;
	private double size;
	
	
	// setter와 생성자 모두 필드값을 설정하는 역할
	// 생성자는 객체가 생성될 때 필드값을 설정
	// setter는 생성된 이후에 필드값을 설정하거나 변경하는 기능
	
	// 이름을 초기화하는 생성자
	Dog(String n){
		name = n;
	}
	
	// 이름과 나이를 초기화하는 생성자
	Dog(String n,int age){
		this(n); // this = 이 객체
		// name = n;
		if(age<0 || age>100) this.age = 5;
		else this.age = age; // 이 객체의 age는 내가 입력한 age
	}
	
	// 이름, 나이, 크기를 초기화하는 생성자
	Dog(String n,int age,double size){
		this(n,age); // 이름과 나이는 초기화
		/* name = n;
		this.age = age; */
		if(size<1 || size>10) this.size = 5;
		else this.size = size;
	}
	
	/*
	생성자
	- 메소드
	- 반환 타입이 없는 메소드
	- 메소드명이 클래스명과 일치
	- 객체의 필드를 초기화(변수에 값을 처음으로 대입)
	*/
	
	// 디폴트 생성자
	Dog(){ // 강아지 클래스의 생성자
		/*
		name = "마음이";
		age = 3;
		size = 5.0;
		*/
		
		this("마음이",3,5.0);
	}
	
	
	public String toString(){ // 특별한 메소드, 기본으로 작동되지만 만들어 줘야함
		return String.format("이름: %s, 나이: %d, 크기: %.2f",name,age,size);
		
		// return "이름: "+name+", 나이: "+age+", 크기: "+size;
	}
}

class Cat{}

class DogTest{
	public static void main(String[] args){
		/*
		Math cal1 = new Math();
		System.out.println(cal1.sin(0));
		
		Math cal2 = new Math();
		System.out.println(cal2.sin(0));
		// cal1이 계산한 것과 cal2가 계산한 값이 같다. -> 객체 안 만들어도 된다.
		*/
		System.out.println(Math.sin(0));
		
		
		
		
		Dog myDog = new Dog("우래깅",10,15);
		System.out.println(myDog.toString());
		
		Dog myDog2 = new Dog();
		System.out.println(myDog2);
		// 객체이름만 출력을 하면 toString메소드가 자동적으로 출력된다.
		
		// 모든 생성자를 사용해서 강아지 4마리 만들기
		Dog dog1 = new Dog("메롱이");
		System.out.println(dog1);
		Dog dog2 = new Dog("이메롱",-2);
		System.out.println(dog2);
		Dog dog3 = new Dog("메롱쨔",7,3.8);
		System.out.println(dog3);
		Dog dog4 = new Dog();
		System.out.println(dog4);
		
		
		
		Cat cat = new Cat();
		System.out.println(cat);
		System.out.println(cat.toString());
		
		
	}
}