// Random number ����
// 1. Math Ŭ���� ���(java.lang.Math)
import java.util.Scanner;

class RandomNumber{
	public static void main(String [] args){
		double randomNumber = Math.random();
		
		System.out.println(randomNumber);
		
		/* 1. 0�̻� 13�̸��� �Ǽ��� ����
		   2. 0�̻� 13������ ������ ����
		   3. 7�̻� 23�̸��� ������ ����
		   4. ������ �Է¹޾Ƽ� �� �ѷ��� ���� ���
		   3.14 = Math.PI */
		
		double num1 = Math.random()*13;
		int num2 = (int)(Math.random()*14);
		/* (int)Math.random()*13���� �� ��� ���� ���� int�� �� �� *13�� �� 0�ۿ� �� ����
		(int)�� ���� �������̱� ������ ���� �����ؼ� �׷��� �ȴ�.
		13������ ������ 13.9999�� ������ �ٲپ 13�̹Ƿ� 14�̸��� �������� �̴´�. */
		int num3 = (int)(Math.random()*16)+7;
		/* Math.random�� 0�̻� 1�̸��̹Ƿ� 13�� ���ϸ� 0�̻� 13�̸��� ��
		   ���������� 7�� �����ָ� 7�̻� 24�̸��� �� */
		
		System.out.print(num1+" "+num2+" "+num3+"\n");
		
		Scanner myScanner = new Scanner(System.in);
		double radius;
		
		System.out.print("�������� �Է����ּ��� : ");
		radius = myScanner.nextDouble();
		
		double length = radius*2*Math.PI;
		double area = radius*radius*Math.PI;
		
		System.out.println("�������� "+radius+"�� ���� �ѷ��� "+length+"�̰�, ���̴� "+area+"�̴�.");
	}
}