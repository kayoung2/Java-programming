/*
강아지, 고양이, 새, 도마뱀, 뱀 클래스
 - 이름
 - 이름을 출력하는 메소드
*/
   

// 강아지 1마리
// 고양이 1마리
// 새 1마리
// 도마뱀 1마리
// 뱀 1마리


// 애완동물 5마리에게 이름을 말해라!!

class Test{
	public static void main(String[] args){
		/*
		Dog mung = new Dog("멍뭉");
		mung.printName();
		
		Cat nyang = new Cat("냥냥");
		nyang.printName();
		
		Bird jjack = new Bird("째짹");
		jjack.printName();
		
		Doma ark = new Doma("앆악");
		ark.printName();
		
		Snake shi = new Snake("쉬익");
		shi.printName();
		*/
		
		Pet[] myPets = new Pet[5]; // 내 애완동물들의 배열
		
		myPets[0] = new Dog("뽀삐");
		myPets[1] = new Cat("야옹이");
		myPets[2] = new Bird("쨰째깅");
		myPets[3] = new Doma("또마도마");
		myPets[4] = new Snake("스눾");
		
		for(Pet myPet: myPets){ // myPets: 뽀비, 야옹이, 쨰째깅,...
			myPet.printName();
		}
	}
}


class Pet{
	String name;
	
	Pet(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}

class Dog extends Pet{ // Pet에 있는 내용을 그대로 복사하겠다. 애완동물 클래스를 상속받겠다.
	// Pet: 부모 클래스, 수퍼 클래스
	// Dog: 자식 클래스, 서브 클래스
}
class Cat extends Pet{}
class Bird extends Pet{}
class Doma extends Pet{}
class Snake extends Pet{}


/*
class Dog{
	String name;
	
	Dog(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}

class Cat{
	String name;
	
	Cat(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}

class Bird{
	String name;
	
	Bird(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}

class Doma{
	String name;
	
	Doma(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}

class Snake{
	String name;
	
	Snake(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
}
*/