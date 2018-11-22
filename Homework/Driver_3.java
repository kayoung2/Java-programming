class Car{
	private int mileage;
	private String color;
	
	public String toString(){
		return String.format("색상 : %s, 주행거리 : %dkm",color,mileage);
	}
	public Car(){
		this(0,"red");
	} // 디폴트 생성자
	
	public Car(int mileage,String color){
		this.mileage=mileage;
		this.color=color;
	}
	
	public void goStraight(int a){
		mileage+=a;
		System.out.println(a+"m 직진했습니다.");
	}
	
	public void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	
	public void turnRight(){
		System.out.print("우회전 후 ");
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
		
		System.out.println("B에 도착했습니다. 총 주행거리는 "+bang.getMileage()+"m 입니다.");
		
		ping.goStraight(10);
		ping.turnRight();
		ping.goStraight(9);
		
		System.out.println("총 주행거리는 "+ping.getMileage()+"m 입니다.");
		
	}
}