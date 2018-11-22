class Driver {
	static String string;
	public static void main(String [] args){
		Car myCar = new Car();
		System.out.println(myCar.toString());
		System.out.println(myCar);
		
		
		
		//내 차 하나 생성
		//A->B까지 굵은 선으로만 이동할 수 있으므로 
		//일단 25m직진 후
		myCar.goStraight(25);
		//좌회전 후
		myCar.turnLeft();
		//30m직진 후
		myCar.goStraight(30);
		//우회전 후
		myCar.turnRight();
		//15m직진 후
		myCar.goStraight(15);
		//좌회전 후
		myCar.turnLeft();
		//20m직진하면 B에 도착
		myCar.goStraight(20);
		
		System.out.println("총 주행 거리는 "+myCar.getMileage()+"m 입니다.");
	}
}

class Car{
	private int mileage; //총 주행거리
	private String color; //색상
	
	//System.out.printf();
	//System.out.format("%d, %f", 변수들...);
	public String toString(){//이 객체에 대한 정보를 String 타입으로 제공하는 메소드
		//return "색상: "+color+" 주행거리: "+mileage;
		return String.format("색상: %s, 주행거리: %dkm",color,mileage);
	}
	
	public Car(){
		//color = "white";
		this(0, "white");//생성자에서 다른 생성자 호출 가능
	}//디폴트 생성자. 
	
	
	public Car(int mileage, String color){
		this.mileage = mileage;
		this.color = color;
	}
	
	public void goStraight(int dist){
		mileage += dist; //총 주행거리에 이동 거리 합산
		System.out.println(dist+"m 직진했습니다.");
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






