// ����� ���� ����: 300�� �̻��� ���̸� ���� ��� �߻��Ǵ� ����!
import java.util.Scanner;

class LastTest{
	public static void main(String[] args){
		try{
			inputAge();
		}catch(TooManyAgeException tmae){
			System.out.println("300�� �̻��� ���̰� �ʹ� �����ϴ�.");
		}catch(NegativeAgeException nae){
			System.out.println("���̴� ������ �� �����ϴ�.");
		}
		System.out.println("���α׷� ����!");
	}
	
	static void inputAge() throws TooManyAgeException, NegativeAgeException{
		Scanner s = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = s.nextInt();
		
		if(age>300) throw new TooManyAgeException();
		else if(age<0) throw new NegativeAgeException();
		else System.out.println("�Է��� ���̴� "+age+"�� �Դϴ�.");
	}
}

class TooManyAgeException extends Exception{
	TooManyAgeException(){
		super("300�� �̻� ���� ����");
	}
}

class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("���� ���� ����"); // Exception(�� ���ܿ� ���� ����)
	}
}