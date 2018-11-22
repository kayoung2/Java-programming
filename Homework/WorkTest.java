import java.util.Scanner;
import java.util.InputMismatchException;

public class WorkTest{
	public static void main(String [] args){
		int numOfWork, workPerEmployee;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ����: ");
		try{
			numOfWork = s.nextInt();//InputMismatchException �߻� ����: ����ڰ� �ѱ۷� �������� �Է����� ��. 
			if(numOfWork<0) throw new NegativeWorkException();//numOfWork<0�� ���, ����� ���� ���� NegativeWorkException�� �߻�!!
			
			workPerEmployee = (int)(Math.ceil(numOfWork/10.0));
			System.out.println("�� ����� �ִ� ���� ��: "+workPerEmployee);
		}catch(NegativeWorkException nwe){
			System.out.println("�������� ������ �� �����ϴ�.");
		}catch(InputMismatchException ime){
			System.out.println("�������� �ƶ��� ���ڷ� �Է����ּ���. ");
		}
		System.out.println("���α׷� ����!");
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("������ ���� ����");
	}
}