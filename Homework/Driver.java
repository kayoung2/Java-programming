class Driver {
	static String string;
	public static void main(String [] args){
		Car myCar = new Car();
		System.out.println(myCar.toString());
		System.out.println(myCar);
		
		
		
		//�� �� �ϳ� ����
		//A->B���� ���� �����θ� �̵��� �� �����Ƿ� 
		//�ϴ� 25m���� ��
		myCar.goStraight(25);
		//��ȸ�� ��
		myCar.turnLeft();
		//30m���� ��
		myCar.goStraight(30);
		//��ȸ�� ��
		myCar.turnRight();
		//15m���� ��
		myCar.goStraight(15);
		//��ȸ�� ��
		myCar.turnLeft();
		//20m�����ϸ� B�� ����
		myCar.goStraight(20);
		
		System.out.println("�� ���� �Ÿ��� "+myCar.getMileage()+"m �Դϴ�.");
	}
}

class Car{
	private int mileage; //�� ����Ÿ�
	private String color; //����
	
	//System.out.printf();
	//System.out.format("%d, %f", ������...);
	public String toString(){//�� ��ü�� ���� ������ String Ÿ������ �����ϴ� �޼ҵ�
		//return "����: "+color+" ����Ÿ�: "+mileage;
		return String.format("����: %s, ����Ÿ�: %dkm",color,mileage);
	}
	
	public Car(){
		//color = "white";
		this(0, "white");//�����ڿ��� �ٸ� ������ ȣ�� ����
	}//����Ʈ ������. 
	
	
	public Car(int mileage, String color){
		this.mileage = mileage;
		this.color = color;
	}
	
	public void goStraight(int dist){
		mileage += dist; //�� ����Ÿ��� �̵� �Ÿ� �ջ�
		System.out.println(dist+"m �����߽��ϴ�.");
	}
	public void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	public void turnRight(){
		System.out.print("��ȸ�� �� ");
		
	}
	public int getMileage(){
		return mileage;
	}
}






