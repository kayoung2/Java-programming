class Dog{
	private int age;
	private String name;
	private double size;
	
	
	// setter�� ������ ��� �ʵ尪�� �����ϴ� ����
	// �����ڴ� ��ü�� ������ �� �ʵ尪�� ����
	// setter�� ������ ���Ŀ� �ʵ尪�� �����ϰų� �����ϴ� ���
	
	// �̸��� �ʱ�ȭ�ϴ� ������
	Dog(String n){
		name = n;
	}
	
	// �̸��� ���̸� �ʱ�ȭ�ϴ� ������
	Dog(String n,int age){
		this(n); // this = �� ��ü
		// name = n;
		if(age<0 || age>100) this.age = 5;
		else this.age = age; // �� ��ü�� age�� ���� �Է��� age
	}
	
	// �̸�, ����, ũ�⸦ �ʱ�ȭ�ϴ� ������
	Dog(String n,int age,double size){
		this(n,age); // �̸��� ���̴� �ʱ�ȭ
		/* name = n;
		this.age = age; */
		if(size<1 || size>10) this.size = 5;
		else this.size = size;
	}
	
	/*
	������
	- �޼ҵ�
	- ��ȯ Ÿ���� ���� �޼ҵ�
	- �޼ҵ���� Ŭ������� ��ġ
	- ��ü�� �ʵ带 �ʱ�ȭ(������ ���� ó������ ����)
	*/
	
	// ����Ʈ ������
	Dog(){ // ������ Ŭ������ ������
		/*
		name = "������";
		age = 3;
		size = 5.0;
		*/
		
		this("������",3,5.0);
	}
	
	
	public String toString(){ // Ư���� �޼ҵ�, �⺻���� �۵������� ����� �����
		return String.format("�̸�: %s, ����: %d, ũ��: %.2f",name,age,size);
		
		// return "�̸�: "+name+", ����: "+age+", ũ��: "+size;
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
		// cal1�� ����� �Ͱ� cal2�� ����� ���� ����. -> ��ü �� ���� �ȴ�.
		*/
		System.out.println(Math.sin(0));
		
		
		
		
		Dog myDog = new Dog("�췡��",10,15);
		System.out.println(myDog.toString());
		
		Dog myDog2 = new Dog();
		System.out.println(myDog2);
		// ��ü�̸��� ����� �ϸ� toString�޼ҵ尡 �ڵ������� ��µȴ�.
		
		// ��� �����ڸ� ����ؼ� ������ 4���� �����
		Dog dog1 = new Dog("�޷���");
		System.out.println(dog1);
		Dog dog2 = new Dog("�̸޷�",-2);
		System.out.println(dog2);
		Dog dog3 = new Dog("�޷�¹",7,3.8);
		System.out.println(dog3);
		Dog dog4 = new Dog();
		System.out.println(dog4);
		
		
		
		Cat cat = new Cat();
		System.out.println(cat);
		System.out.println(cat.toString());
		
		
	}
}