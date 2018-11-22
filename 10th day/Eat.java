// 강아지
// 메소드: 음식을 매개변수로 받아 그 음식을 먹는 메소드
// 음식 클래스
// 햄버거 클래스, 피자 클래스, 딸기 클래스, 콜라 클래스

class Dog{
	void eat(Food f){
		System.out.println(f.getClass().getName()+"를(을) 먹습니다.");
		
		/*
		if(f instanceof Burger) System.out.println("햄버거를 먹습니다.");
		else if(f instanceof Pizza) System.out.println("피자를 먹습니다.");
		else if(f instanceof Strawberry) System.out.println("딸기를 먹습니다.");
		else if(f instanceof Coke) System.out.println("콜라를 먹습니다.");
		*/
	}
	
	/*
	void eat(Burger b){
		System.out.println("햄버거를 먹습니다.");
	}
	
	void eat(Pizza p){
		System.out.println("피자를 먹습니다.");
	}
	
	void eat(Strawberry s){
		System.out.println("딸기를 먹습니다.");
	}
	
	void eat(Coke c){
		System.out.println("콜라를 먹습니다.");
	}
	*/
}

class Food{}
class Burger extends Food{}
class Pizza extends Food{}
class Strawberry extends Food{}
class Coke extends Food{}
class Icecream extends Food{}

class Eat{
	public static void main(String[] args){
		Burger b = new Burger();
		Pizza p = new Pizza();
		Strawberry s = new Strawberry();
		Coke c = new Coke();
		Icecream i = new Icecream();
		
		Dog d = new Dog();
		d.eat(b); // 햄버거를 먹습니다.
		d.eat(p);
		d.eat(s);
		d.eat(c);
		d.eat(i);
	}
}