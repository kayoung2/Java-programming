/*
������, �����, ��, ������, �� Ŭ����
 - �̸�
 - �̸��� ����ϴ� �޼ҵ�
*/
   

// ������ 1����
// ����� 1����
// �� 1����
// ������ 1����
// �� 1����


// �ֿϵ��� 5�������� �̸��� ���ض�!!

class Test{
	public static void main(String[] args){
		/*
		Dog mung = new Dog("�۹�");
		mung.printName();
		
		Cat nyang = new Cat("�ɳ�");
		nyang.printName();
		
		Bird jjack = new Bird("°±");
		jjack.printName();
		
		Doma ark = new Doma("�о�");
		ark.printName();
		
		Snake shi = new Snake("����");
		shi.printName();
		*/
		
		Pet[] myPets = new Pet[5]; // �� �ֿϵ������� �迭
		
		myPets[0] = new Dog("�ǻ�");
		myPets[1] = new Cat("�߿���");
		myPets[2] = new Bird("��°��");
		myPets[3] = new Doma("�Ǹ�����");
		myPets[4] = new Snake("����");
		
		for(Pet myPet: myPets){ // myPets: �Ǻ�, �߿���, ��°��,...
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
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}

class Dog extends Pet{ // Pet�� �ִ� ������ �״�� �����ϰڴ�. �ֿϵ��� Ŭ������ ��ӹްڴ�.
	// Pet: �θ� Ŭ����, ���� Ŭ����
	// Dog: �ڽ� Ŭ����, ���� Ŭ����
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
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}

class Cat{
	String name;
	
	Cat(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}

class Bird{
	String name;
	
	Bird(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}

class Doma{
	String name;
	
	Doma(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}

class Snake{
	String name;
	
	Snake(String name){
		this.name = name;
	}
	
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}
*/