import java.util.Scanner;

class IfTest{
	public static void main(String [] args){
		/*
		if(조건){
			실행할 문장;
		}
		*/
		
		/*
		if(조건){}
		else{}
		*/
		
		int point = 90;
		// 70점 이상이면 합격, 아니면 불합격
		
		if(point>=70)
			System.out.println("합격입니다!");
		else
			System.out.println("불합격입니다.");
		
		// 90점 이상이면 장학금, 70점 이상이면 수업료 면제, 아니라면 불합격입니다
		
		if(point>=90)
			System.out.println("장학금");
		else if(point>=70)
			System.out.println("수업료 면제"); // 70점이상 90점미만
		else
			System.out.println("불합격");
	}
}