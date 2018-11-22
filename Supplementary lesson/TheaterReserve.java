import java.util.Scanner;

public class TheaterReserve{
	public static void main(String [] args){
		int[] seat = {1,2,3,4,5,6,7,8,9,10};
		int[] person = {0,0,0,0,0,0,0,0,0,0};
		
		Scanner input = new Scanner(System.in);
		
		while(true){ // while(true)를 하면 조건에 상관없이 계속 반복하게 된다. C에서는 1도 가능
		System.out.println("------------------------");
		
		for(int i=0;i<10;i++)
		{
			System.out.print(seat[i]+" ");
		}
		
		System.out.println(""); // 한 줄 띄워주기 위함
		System.out.println("------------------------");
		
		for(int j=0;j<10;j++)
		{
			System.out.print(person[j]+" ");
		}
		
		System.out.println("");
		System.out.println("------------------------");
		
		System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
		int number = input.nextInt();
		
		if(number==-1)
			break;
		// break를 먼저 넣어줘야한다 왜냐하면 person[-2]는 없기 때무니다!!!
		
		if(person[number-1]==0)
		{
			person[number-1]=1;
			
			System.out.println("예약되었습니다.");
		}
		
		if(person[number-1]==1)
		{
			System.out.println("이미 예약된 자리입니다.");
		}
		
		}
	}
}