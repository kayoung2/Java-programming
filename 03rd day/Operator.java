// ���� �� �� �Է¹޾� �� ���� ����� ���
// test : 3,14�� �׽�Ʈ

import java.util.Scanner; // java.util�̶�� ���� �ȿ� �ִ� Scanner class�� import �ϰڴ�.
import java.util.Random; // java.util ��Ű��(����) ���� Random class�� import �ϰڴ�.
// ��Ű�� = ������ ������ class���� ��Ƴ��� ����

import java.util.*; // java.util ��Ű���� �����ϴ� ��� class�� import �ϰڴ�.
// java.lang ��Ű���� �����ϴ� class���� �ڵ� import
// Math, System, String ���� import���� �ʾƵ� ��� �����ϴ�.

class Operator{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); // ���� �����⸦ �����ϰ� ran���� ����
		
		System.out.println(Math.pow(3,2));
		System.out.println(Math.sqrt(3)); // ������ �Լ�
		// ������ ������ ?? NaN(Not a Number)��� ���.
		// Math.pow(a,b) = a�� b����
		
		System.out.println(ran.nextInt()); // int ������ ����
		System.out.println(ran.nextInt(6)); // 0-5������ ������ ����, 6�̸�
		System.out.println(ran.nextInt(7)+17); // 17-23������ ������ ����
		
// ������ ȭ���� 100�� �Ĵ� ?? �����
// ����(���ڷ� ��:0, ��:1, ȭ:2, ...)�� �Է¹ް� ��ĥ �ڰ� ���� �������� ��� 
		
		System.out.print("������ ���� �����ΰ���? (��:0, ��:1, ... ��:6) : ");
		int c = scan.nextInt();
		
		System.out.print("��ĥ ���� ������ �ñ��ϽŰ���? : ");
		int d = scan.nextInt();
		
		int e = c+(d%7);
		
		if(e>=7)
			e = e-7; // 7�� ������ switch���� �۵� �Ұ�
		else
			e = e;
		
		switch(e){
			case 0:
			System.out.printf("���÷� ���� %d�� �ڴ� �Ͽ��� �Դϴ�.\n", d);
			break;
			
			case 1:
			System.out.printf("���÷� ���� %d�� �ڴ� ������ �Դϴ�.\n", d);
			break;
			
			case 2:
			System.out.printf("���÷� ���� %d�� �ڴ� ȭ���� �Դϴ�.\n", d);
			break;
			
			case 3:
			System.out.printf("���÷� ���� %d�� �ڴ� ������ �Դϴ�.\n", d);
			break;
			
			case 4:
			System.out.printf("���÷� ���� %d�� �ڴ� ����� �Դϴ�.\n", d);
			break;
			
			case 5:
			System.out.printf("���÷� ���� %d�� �ڴ� �ݿ��� �Դϴ�.\n", d);
			break;
			
			case 6:
			System.out.printf("���÷� ���� %d�� �ڴ� ����� �Դϴ�.\n", d);
			break;
		}
		
		
		int a,b;
		
		System.out.print("a : ");
		a = scan.nextInt();
		
		System.out.print("b : ");
		b = scan.nextInt();
		
		System.out.println("�Է��Ͻ� �� ���� ����� "+((double)a+b)/2+"�Դϴ�.");
		System.out.println(3+4); //7 ������ �ǹ�
		System.out.println("A"+3+4); //A34 ������ �ǹ�
		System.out.println('a'+'b'+3+4); // �� ������ ascii���� ������ ��
	}
}