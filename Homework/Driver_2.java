class Car{
	private int mileage;
	private String color;
	
	int x, x0;
	int y, y0;
	int direction=0;
	int length=0;
	
	Car(int x, int y){
		this.x=x;
		x0=x;
		
		this.y=y;
		y0=y;
	}
	
	void goStraight(int a){
		if(direction==0) y+=a;
		else if(direction==1) x-=a;
		else if(direction==2) y-=a;
		else x+=a;
		
		length+=a;
	}
	
	void turnLeft(){
		if(direction==0) direction=1;
		else if(direction==1) direction=2;
		else if(direction==2) direction=3;
		else direction=0;
	}
	
	void turnRight(){
		if(direction==0) direction=3;
		else if(direction==1) direction=0;
		else if(direction==2) direction=1;
		else direction=2;
	}
	
	int getMileage(int a){
		mileage = a;
		return a;
	}
}

class Driver_2{
	public static void main(String[] args){
		Car bung = new Car(0,0);
		
		System.out.println("bung의 현재 위치는 ("+bung.x+", "+bung.y+") 입니다.");
		
		bung.goStraight(25);
		bung.turnLeft();
		bung.goStraight(30);
		bung.turnRight();
		bung.goStraight(15);
		bung.turnLeft();
		bung.goStraight(20);
		
		if(bung.x==-50 && bung.y==40) System.out.println("B에 도착했습니다. 총 주행거리는 "+bung.length+"입니다.");
		
	}
}