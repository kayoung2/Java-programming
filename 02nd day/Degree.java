import java.util.Scanner;

class Degree{
	public static void main(String [] args){
		// ȭ��->����, ����=((5/9)*(ȭ��-32))
		double degree1, degree2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է����ּ���. ");
		degree1 = scan.nextDouble();
		
		degree2=(degree1-32)*5/9;
		
		System.out.println("�Է��Ͻ� �µ��� ȭ�� "+degree2+"�� �Դϴ�.");
	}
}