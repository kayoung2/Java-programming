class Animal{
	void move(){
		System.out.print("���� "+this.getClass().getName()+"�̰�, ");
	}
}
class Cat extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
}
class Dolphin extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
}
class Dove extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
}

class Test{
	public static void main(String[] args){
		Animal[] animal={new Cat(), new Dolphin(), new Dove()};
		
		for(Animal a: animal) a.move();
	}
}