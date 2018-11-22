// 사용자로부터 정수를 입력받고, 1111이 입력되면 입력을 멈춘다. 그리고 이제까지 입력된 수들의 합을 출력 (단, 마지막에 입력된 1111은 제외, 9의 배수도 제외)

import java.util.Scanner;

class Sum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int sum=0, number; // do while 함수 밖에서 sum, number가 쓰이므로 미리 선언해주어야 한다.
		
		
		do{
			System.out.print("정수를 입력하시오. ");
			number = s.nextInt();
			
			if(number%9==0)
				sum=sum;
			else
				sum+=number;
			
		}while(number!=1111);
		
		System.out.print("합 : "+(sum-1111)); // 1111까지 더해진 수가 sum이므로 1111빼주어야 한다.
		
		
		/* 교수님이 하시던 거 ㅎㅎ..
		int input;
		
		while(true){
			System.out.print("정수 : ");
			input = s.nextInt();
			
			if(input==1111) break;
			
			// if(input%9!=0) sum+=input;
			if(input%9==0) continue; // 다음 문장 skip하고 바로 처음으로
			
			sum += input;
		}
		
		System.out.println("합 : "+sum);
		
		*/
		
	}
}