class Car{
	private int mileage;
	private String color;
	
	public String toString(){
		return String.format("���� : %s, ����Ÿ� : %dkm",color,mileage);
	}
	public Car(){
		this(0,"red");
	} // ����Ʈ ������
	
	public Car(int mileage,String color){
		this.mileage=mileage;
		this.color=color;
	}
	
	public void goStraight(int a){
		mileage+=a;
		System.out.println(a+"m �����߽��ϴ�.");
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

class Driver_3{
	public static void main(String[] args){
		Car bang = new Car(0,"pink");
		Car ping = new Car();
		
		System.out.println(bang.toString());
		System.out.println(ping);
		
		bang.goStraight(25);
		bang.turnLeft();
		bang.goStraight(30);
		bang.turnRight();
		bang.goStraight(15);
		bang.turnLeft();
		bang.goStraight(20);
		
		System.out.println("B�� �����߽��ϴ�. �� ����Ÿ��� "+bang.getMileage()+"m �Դϴ�.");
		
		ping.goStraight(10);
		ping.turnRight();
		ping.goStraight(9);
		
		System.out.println("�� ����Ÿ��� "+ping.getMileage()+"m �Դϴ�.");
		
	}
}