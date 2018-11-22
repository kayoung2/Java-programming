import java.util.Scanner;

class Year{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int year = s.nextInt();
		
		System.out.print("�� �� : ");
		int month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(year+"�� "+month+"���� 31�ϱ��� �ֽ��ϴ�.");
			break;
			
			case 4: case 6: case 9: case 11:
			System.out.print(year+"�� "+month+"���� 30�ϱ��� �ֽ��ϴ�.");
			break;
			
			case 2:
			if((year%4==0 && year%100!=0) || year%400==0)
				System.out.print(year+"�� "+month+"���� 29�ϱ��� �ֽ��ϴ�.");
			else
				System.out.print(year+"�� "+month+"���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		}
		
	}
}