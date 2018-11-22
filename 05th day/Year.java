import java.util.Scanner;

class Year{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 년 : ");
		int year = s.nextInt();
		
		System.out.print("몇 월 : ");
		int month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(year+"년 "+month+"월은 31일까지 있습니다.");
			break;
			
			case 4: case 6: case 9: case 11:
			System.out.print(year+"년 "+month+"월은 30일까지 있습니다.");
			break;
			
			case 2:
			if((year%4==0 && year%100!=0) || year%400==0)
				System.out.print(year+"년 "+month+"월은 29일까지 있습니다.");
			else
				System.out.print(year+"년 "+month+"월은 28일까지 있습니다.");
			break;
		}
		
	}
}