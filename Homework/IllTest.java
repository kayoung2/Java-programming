import java.util.*;

class IllTest{
	public static void main(String[] args){
		try{
			inputNumberOfwork();
		}catch(NegativeWorkException nwe){
			System.out.println("�������� ������ �� �����ϴ�.");
		}catch(InputMismatchException ime){
			System.out.println("�������� �ƶ��� ���ڷ� �Է����ּ���.");
		}
		System.out.println("���α׷� ����!");
	}
	
	static void inputNumberOfwork() throws NegativeWorkException{
		Scanner s = new Scanner(System.in);
		
		double numberOfwork;
		
		System.out.print("�� ���� ����: ");
		numberOfwork = s.nextInt();
		
		if(numberOfwork<0) throw new NegativeWorkException();
		else System.out.println("�� ����� �ִ� ���� ��: "+(int)(Math.ceil(numberOfwork/10)));
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("���� �� ����");
	}
}