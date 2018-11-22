// �ʵ�: ��ü���� ���������� ����
// ��ü�鳢�� �����ϴ� �ʵ�: static
// �޼ҵ�: ��ü�鳢�� ����: Ŭ�������� �ϳ��� �ڵ� ����
// static method: ��� ��ü���� �Ȱ��� ����� ����� ��� static���� �ۼ�

// �ڵ��� Ŭ����
// ������: ����, ���� �ʱ�ȭ�ϴ� ������
// �������� ����� �ڵ��� ��� �����ϴ� ����

// ���θ޼ҵ�
// �ڵ��� ��� ������ �������� ������ �ڵ��� ������� ���

class Car{
	String color;
	int year;
	static int numOfCar; // ��� ��ü���� ����, �ʵ�� �ʱ�ȭ���� �ʾƵ� �ڵ����� 0
	
	// ���� ����ϴ� �޼ҵ�
	void printColor(){ // ����� ��ü���� �ٸ��⶧���� static x
		System.out.println("�� �ڵ����� ������ "+this.color+"�Դϴ�.");
	}
	
	/*
	static void m1(){ // static �޼ҵ忡���� non-static ��� ��� �Ұ� non-static���� static�� ����
		System.out.println("����: "+year);
	}
	*/
	// main �޼ҵ尡 static�϶� main�ȿ��� static�� ȣ�� ���� �ϹǷ� �ٸ� �޼ҵ忡 �� static����
	
	// �������� ����� �ڵ��� ��� ����ϴ� �޼ҵ�
	static void printNumOfCar(){
		System.out.println("�������� ����� �ڵ���: "+numOfCar);
		// ���� this.numOfCar�� �ϸ� ������x static�� ��ü�� ���� ��Ȳ������ ȣ�Ⱑ���ѵ� this�� ��ü�� ����Ŵ
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
		// static ������ Ŭ���� �̸����� ����
		System.out.println("�������� ����� �ڵ���: "+Car.numOfCar);
		Car.printNumOfCar();
		
		// ��ü���� �迭
		Car[] myCars = new Car[10]; // �� �迭�� �ڵ��� 10�� ���� ����
		// int[] arr = new int[10];
		
		myCars[0] = new Car("black",2010);
		myCars[0].printColor();
		System.out.println("�������� ����� �ڵ���: "+Car.numOfCar);
		
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