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
		System.out.println("���� �����ϴ�.");
		door = true;
	}
	void close(){
		System.out.println("���� �����ϴ�.");
		door = false;
	}
	void move(int i){
		close();
		
		if(i>=-2 && i<=10){
			if(i==0) System.out.println("�κ������� �̵��մϴ�.");
			else if(i>0) System.out.println(i+"������ �̵��մϴ�.");
			else System.out.println("����"+(-1*i)+"������ �̵��մϴ�.");
			floor=i;
		}
		else{
			System.out.print("��ȿ�� ������ �Է����ּ���.");
			return;
		}
		
		report();
		open();
	}
	void report(){
		if(floor>0) System.out.println(floor+"���� �ֽ��ϴ�.");
		else if(floor<0) System.out.println("����"+(-1*floor)+"���� �ֽ��ϴ�.");
		else System.out.println("�κ� �ֽ��ϴ�.");
	}
}