// ����: ����
class Animal{
	int age;
	
	Animal(int age){
		this.age=age;
		System.out.println("���̰� "+age+"���� ���� ����!!");
	}
	Animal(){
		System.out.println("���� ������ ȣ��!!");
	}
	
	void sleep(){
		System.out.println("�ڴ� ���Դϴ�, ,, �����,,zZZz");
	}
	
	void eat(){
		System.out.println("�դ������ ��ƿ�� �ȳĤ� �԰� �־��!! �ǵ帮�� ������!");
	}
}

class Dog extends Animal{
	Dog(){
		System.out.println("������ ������ ȣ��!!");
	}
	@Override // �������̵�(������): �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ������ �°� ����!!
	void sleep(){ // �ڴ� ���Դϴ�, ,, �����,,zZZz ���� ��������,,
		super.sleep(); // �ڱ� �̸� this�� ��ó�� �θ� �̸��� �Ժη� �θ���x
		System.out.println("���� ��������,,");
	}
	void bark(){
		System.out.println("�п��������ξ� ����������....������...��!! �Ȥ��Ȥ�! ��!!");
	}
}

// �����: ����, ����
class Cat extends Animal{
	String color;
	
	Cat(int age, String color){
		super(age); // super.age = age;
		this.color = color;
		System.out.println(color+"���� ����� ����!!");
	}
	Cat(){
		System.out.println("����� ������ ȣ��!!");
	}
	@Override
	void sleep(){
		super.sleep();
		System.out.println("����� �����̶��ϴ���~~..");
	}
	void play(){
		System.out.println("�ľƿ�~ ������ ��� ���̿���~ ���� ��ƿ�~.~~");
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
		
		// 5���� ���� ����� ����!!
		Cat blackCat = new Cat(5,"����");
	}
}