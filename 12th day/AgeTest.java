// ���� �Է¹޾Ƽ� �״�� ����ϴ� ���α׷�: input()���� ����
import java.util.Scanner;

class AgeTest{
	public static void main(String[] args){
		// ���� ó��
		try{
			inputAge(); // NegativeAgeException ���ܰ� �߻��� �� �ִ� �ڵ�
		}catch(NegativeAgeException nae){
			nae.printStackTrace(); // ���߿�(�׽�Ʈ��)
			System.out.println("���̴� ������ �� �����ϴ�."); // ������
		}
		
		System.out.println("���α׷� ����!");
	}
	
	static void inputAge() throws NegativeAgeException{
		Scanner s = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = s.nextInt();
		// age�� ������� ���ܹ߻�, �ƴ϶�� �״�� ���̸� ���
		// ����� ���� ����: �⺻������ �����ǰ� �ִ� ���ܰ� �ƴ϶� ����ڰ� ������ ���� -> !!! �⸻�� 1���� !!!
		
		if(age<0) throw new NegativeAgeException(); // throw�� ���ܰ� �߻��Ǿ����� JVM���� �˷���
		else System.out.println("�Է��� ���̴� "+age+"�� �Դϴ�.");
	}
}

class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("���� ���� ����"); // Exception(�� ���ܿ� ���� ����)
	}
}