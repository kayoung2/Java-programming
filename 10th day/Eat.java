// ������
// �޼ҵ�: ������ �Ű������� �޾� �� ������ �Դ� �޼ҵ�
// ���� Ŭ����
// �ܹ��� Ŭ����, ���� Ŭ����, ���� Ŭ����, �ݶ� Ŭ����

class Dog{
	void eat(Food f){
		System.out.println(f.getClass().getName()+"��(��) �Խ��ϴ�.");
		
		/*
		if(f instanceof Burger) System.out.println("�ܹ��Ÿ� �Խ��ϴ�.");
		else if(f instanceof Pizza) System.out.println("���ڸ� �Խ��ϴ�.");
		else if(f instanceof Strawberry) System.out.println("���⸦ �Խ��ϴ�.");
		else if(f instanceof Coke) System.out.println("�ݶ� �Խ��ϴ�.");
		*/
	}
	
	/*
	void eat(Burger b){
		System.out.println("�ܹ��Ÿ� �Խ��ϴ�.");
	}
	
	void eat(Pizza p){
		System.out.println("���ڸ� �Խ��ϴ�.");
	}
	
	void eat(Strawberry s){
		System.out.println("���⸦ �Խ��ϴ�.");
	}
	
	void eat(Coke c){
		System.out.println("�ݶ� �Խ��ϴ�.");
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
		d.eat(b); // �ܹ��Ÿ� �Խ��ϴ�.
		d.eat(p);
		d.eat(s);
		d.eat(c);
		d.eat(i);
	}
}