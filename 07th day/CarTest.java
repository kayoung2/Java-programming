class Car{
	int age; // ����
	static int numOfCar; // �������� ����� �ڵ��� ���
	// numOfCar�� �ʵ������� ��ü�鳢�� �����ϱ� ���ؼ� static����
	// ������ �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	Car(int age){
		this.age = age;
		numOfCar++;
	}
	
	// �ڵ����� �Ѵ� ������ ������ numOfCar�� �ϳ��� ����
	
}

class CarTest{
	public static void main(String[] args){
		Car c1 = new Car(2010);
		Car c2 = new Car(2018);
		
		System.out.println("�������� ����� �ڵ��� ���: "+Car.numOfCar);
		// static ������ �����ϱ� ���ؼ��� class���� ���
	}
}