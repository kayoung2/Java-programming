/* switch(����)<-������ String, ���� int 
case ���� : ������ ����, But case 1,2 : �̷��� ������ ���� �� ��
�ϰ� �ʹٸ� case 1 : case 2 : ������ ���� �̷��� ��� ����
switch������ break�� ���� ������ �ش�Ǵ� case������ ��~ ��µ� */

import java.util.Scanner;

class test4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� ���� ? ");
		String day = s.next();
		int date;
		
		System.out.print("���� ��? ");
		int next = s.nextInt();
		
		switch(day){
			case "�Ͽ���":
			date=0;
			break;
			
			case "������":
			date=1;
			break;
			
			case "ȭ����":
			date=2;
			break;
			
			case "������":
			date=3;
			break;
			
			case "�����":
			date=4;
			break;
			
			case "�ݿ���":
			date=5;
			break;
			
			case "�����":
			date=6;
			break;
			
			default:
			System.out.print("[�Է¿���] ���α׷��� �����մϴ�.");
			return; // System.exit(); -> ���α׷� ����, But date�ʱ�ȭ �������
			/* return�� �Լ��� �����ϴ� ��ɾ� (main�Լ��� ����)
			�޼ҵ带 �����ϴ� Ű����! ���⼭�� main() �޼ҵ带 �����ϴ� �ǹ�! */
		}
		
		switch((date+next)%7){
			case 0:
			day="�Ͽ���";
			break;
			
			case 1:
			day="������";
			break;
			
			case 2:
			day="ȭ����";
			break;
			
			case 3:
			day="������";
			break;
			
			case 4:
			day="�����";
			break;
			
			case 5:
			day="�ݿ���";
			break;
			
			case 6:
			day="�����";
			break;
		}
		
		System.out.println("���÷� ���� "+next+"�� �Ĵ� "+day+"�Դϴ�.");
		
	}
}