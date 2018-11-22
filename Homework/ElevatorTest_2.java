class ElevatorTest_2{
	public static void main(String[] args){
		Elevator e1 = new Elevator();
		Elevator e2 = new Elevator();
		
		e1.move(3);
		e1.report();
		
		e2.move(-2);
		e2.report();
	}
}


class Elevator{
	int floor=0;
	boolean door;
	
	void open(){
		System.out.println("문이 열립니다.");
		door = true;
	}
	void close(){
		System.out.println("문이 닫힙니다.");
		door = false;
	}
	void move(int i){
		close();
		
		if(i>=-2 && i<=10){
			if(i==0) System.out.println("로비층으로 이동합니다.");
			else if(i>0) System.out.println(i+"층으로 이동합니다.");
			else System.out.println("지하"+(-1*i)+"층으로 이동합니다.");
			floor=i;
		}
		else{
			System.out.print("유효한 층수를 입력해주세요.");
			return;
		}
		
		report();
		open();
	}
	void report(){
		if(floor>0) System.out.println(floor+"층에 있습니다.");
		else if(floor<0) System.out.println("지하"+(-1*floor)+"층에 있습니다.");
		else System.out.println("로비에 있습니다.");
	}
}