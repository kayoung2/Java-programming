// 동물: 나이
class Animal{
	int age;
	
	Animal(int age){
		this.age=age;
		System.out.println("나이가 "+age+"살인 동물 생성!!");
	}
	Animal(){
		System.out.println("동물 생성자 호출!!");
	}
	
	void sleep(){
		System.out.println("자는 중입니당, ,, 쿨쿠울,,zZZz");
	}
	
	void eat(){
		System.out.println("왕ㅋ쿠왘쿠 우걱우걱 냠냐ㅁ 먹고 있어요!! 건드리지 마세요!");
	}
}

class Dog extends Animal{
	Dog(){
		System.out.println("강아지 생성자 호출!!");
	}
	@Override // 오버라이드(재정의): 부모 클래스의 메소드를 자식 클래스에 맞게 수정!!
	void sleep(){ // 자는 중입니당, ,, 쿨쿠울,,zZZz 나는 깡지에용,,
		super.sleep(); // 자기 이름 this인 것처럼 부모 이름도 함부로 부르지x
		System.out.println("나는 깡지에용,,");
	}
	void bark(){
		System.out.println("왈오랑ㄹㅇ로알 으렁르러엉....으르렁...컹!! 컹ㅋ컹ㄲ! 왈!!");
	}
}

// 고양이: 나이, 색상
class Cat extends Animal{
	String color;
	
	Cat(int age, String color){
		super(age); // super.age = age;
		this.color = color;
		System.out.println(color+"색의 고양이 생성!!");
	}
	Cat(){
		System.out.println("고양이 생성자 호출!!");
	}
	@Override
	void sleep(){
		super.sleep();
		System.out.println("저어는 꼬냥이랍니댜아~~..");
	}
	void play(){
		System.out.println("냐아옹~ 지금은 노는 중이에요~ 같이 놀아요~.~~");
	}
}

class TestAnimal{
	public static void main(String [] args){
		/*
		Dog d = new Dog();
		d.eat();
		d.bark();
		d.sleep();
		
		Cat c = new Cat();
		c.play();
		c.sleep();
		*/
		
		// 5살의 검은 고양이 생성!!
		Cat blackCat = new Cat(5,"검정");
	}
}