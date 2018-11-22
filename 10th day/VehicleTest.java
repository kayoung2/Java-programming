/*
Ż��: �θ�
-�ʵ�: ������, ������ Ż���� ����
-������: ����Ʈ ������, �������� �ʱ�ȭ�ϴ� ������

������: �ڽ�
-�ʵ�: ������
-������: �������� �ʱ�ȭ�ϴ� ������

�ڵ���: �ڽ�
-�ʵ�: ������, ������
-������: �������� �����縦 �Ű������� �޾� �ʱ�ȭ�ϴ� ������
*/

class Vehicle{
	int tire;
	static int num;
	
	Vehicle(){
		num++;
	}
	
	Vehicle(int tire){
		this(); // num++; = Vehicle(); = this();
		this.tire = tire;
	}
	
	int Straight(int l){
		return l;
	}
	
	// equals() �޼ҵ� ������: �������� ���ٸ� ���� Ż������ ������
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Vehicle) // o�� Vehicle�� �����̶��
			return this.tire == ((Vehicle)obj).tire; // this.tire���� tire�� ���ư��� �Ѵ�!
		else
			return false;
	}
}

class Bike extends Vehicle{
	Bike(int tire){
		super(tire);
	}
}

class Car extends Vehicle{
	String maker;
	
	Car(int tire,String maker){
		super(tire); // Vehicle(tire); = this.tire = tire;
		// �θ�Ŭ������ �����ڴ� ������ �� ó���� �ҷ��;��� !!
		// ���� this.tire = tire; �ؼ��� �� �ǰ� �θ�Ŭ������ �ʵ��̱⶧���� �θ�Ŭ�������� �ʱ�ȭ
		this.maker = maker;
	}
}

class Stone{ // �ʵ�: ����
	// ������: ���Ǹ� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	// ���ǰ� ���� ���̶�� ���� ���� �����ϵ��� equals �޼ҵ� ������
	
	double volume;
	
	Stone(double volume){
		this.volume = volume;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Stone)
			return this.volume == ((Stone)obj).volume;
		else
			return false;
	}
}

class VehicleTest{
	public static void main(String[] args){
		Vehicle c1 = new Car(4,"����"); // Ż�� c1�� ���� 4���� �����翡�� ���� �ڵ����̴�.
		// ��ĳ����: ���� Ŭ������ �̸� �ٿ��ִ� ��, ��� ���谡 ���� �ÿ��� �׻� ����
		System.out.println(c1.tire);
		System.out.println(((Car)c1).maker); // c1�� Ż�͸� ����Ų��. ���� c1������ tire�� ���� ����
		// �ٿ�ĳ����: ������ ���� �� �Ҽ��� �ִ�.
		Car myCar = (Car)c1;
		Bike myBike = (Bike)c1; // �������� �ǳ� �����Ҷ� ���ܰ� �߻�
		
		Car c2 = new Car(3,"ȿ��");
		System.out.println(c2.tire);
		System.out.println(c2.maker);
		
		Car c3 = new Car(4,"����");
		Vehicle b1 = new Bike(3);
		Object b2 = new Bike(4);
		Bike b3 = new Bike(2);
		
		System.out.println("�������� ������ Ż�� ����: "+Vehicle.num);
		// num�� Test Ŭ������ �ƴ϶� Vehicle Ŭ������ �����Ƿ� Vehicle.num �Ǵ� Car.num �Ǵ� Bike.num
		System.out.println(b1.Straight(30)+"m��ŭ �����߽��ϴ�.");
		
		System.out.println("c1, b1 ��: "+c1.equals(b1)); // c1, b1 ��
		
		Object o = new Stone(1);
		Stone s = new Stone(1);
		// �� s�� b1 ������ ������ �� => false
		System.out.println("s, b1 ��: "+b1.equals(s));
		
		// instanceof �׽�Ʈ
		System.out.print("���� ���� Ż���� ��: ");
		System.out.println(o instanceof Vehicle); // o�� �׳� Object(����)�̱� ������ �������� ����, false
		System.out.println(o instanceof Stone); // ��
		// System.out.println(s instanceof Vehicle); // s�� ��, ��Ӱ��谡 ������ ������ �Ұ�
		System.out.println(b1 instanceof Vehicle); // true
		// System.out.println(b1 instanceof Car); // bike�� car�� ��Ӱ��谡 x
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Car); // �������� ����, false
		
		System.out.println(o instanceof Stone); // true
		System.out.println(o instanceof Vehicle); // false
		System.out.println(o instanceof Car); // false
		
		System.out.println(b2 instanceof Stone); // false
		
		System.out.println(b3 instanceof Vehicle); // true
		// System.out.println(b3 instanceof Car); // ������ �Ұ�
	}
}