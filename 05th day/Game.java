// ���� 79: ����ڰ� �ѹ����� ���� ���߱� ����

import java.util.Scanner;

class Game{
	public static void main(String[] args){
		int answer=79;
		int number, tries=0;
		
		Scanner s = new Scanner(System.in);
		
		
		while(true){
			System.out.print("���� : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("������ �� �� Ů�ϴ�.");
			else if(number>answer)
				System.out.println("������ �� �� �۽��ϴ�.");
			else{
				System.out.println("�����Դϴ�. "+tries+"������ ���߼̽��ϴ�!");
				break;
			}
		}
		
		
		/*
		do{
			System.out.print("���� : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("������ �� �� Ů�ϴ�.");
			else if(number>answer)
				System.out.println("������ �� �� �۽��ϴ�.");
			
			
		}while(number!=answer); // ;;;;!! �����ݷ�!!
		
		System.out.println("�����Դϴ�. "+tries+"������ ���߼̽��ϴ�!");
		*/
		
		/*
		System.out.print("���� : ");
		number = s.nextInt();
		tries++;
		
		if(number<answer)
				System.out.println("������ �� �� Ů�ϴ�.");
		else if(number>answer)
			System.out.println("������ �� �� �۽��ϴ�.");
		else
			System.out.println("�����Դϴ�. "+tries+"������ ���߼̽��ϴ�!");
		
		while(number!=answer){ // ���� ������ �� ���� ��� �ݺ�
			System.out.print("���� : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("������ �� �� Ů�ϴ�.");
			else if(number>answer)
				System.out.println("������ �� �� �۽��ϴ�.");
			else
				System.out.println("�����Դϴ�. "+tries+"������ ���߼̽��ϴ�!");
				
		}
		*/
		
	}
}