import java.util.Scanner;

class Operator3{
	public static void main(String [] args){
		/*
		System.out.println(3&7);
		System.out.println(3|7);
		System.out.println(3^7);
		System.out.println(~7);
		*/
		
		/*
		사용자로부터 정수 1개 입력 받아 그 수를 비트로 표현했을 때,
		1. 가장 오른쪽 비트 판단하기
		2. 오른쪽에서 3번째 비트 판단하기
		*/
		
		Scanner s = new Scanner(System.in);
		
		int number;
		
		System.out.print("정수 1개를 입력하시오. ");
		number = s.nextInt();
		
		/*
		int result1 = number&1;
		System.out.println("입력하신 수의 가장 오른쪽 비트는 "+result1+"입니다.");		
		*/
		
		// 교수님이 하신 방법
		int pro1 = ((number&1)==1?1:0);
		System.out.println("입력하신 수의 가장 오른쪽 비트는 "+pro1+"입니다.");
		
		/*
		int result2 = number&4;
		System.out.println("입력하신 수의 오른쪽에서 3번째 비트는 "+result2/4+"입니다.");
		*/
		
		//교수님이 하신 방법
		int pro2 = ((number&4)==4?1:0);
		System.out.println("입력하신 수의 오른쪽에서 3번째 비트는 "+pro2+"입니다.");
		}
}