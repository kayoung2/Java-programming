import java.util.Scanner;
import java.lang.Math;

public class NumberGame{
	public static void main(String [] args){
	   	int a = (int)(Math.random()*100); // 랜덤 수를 어떤 곳에 넣어줘야 함
		
		int answer=101;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; a!=answer ;i++){ // 처음에 answer의 값이 있어야 함
			// for문은 중간의 조건식이 참이면 실행
			System.out.print("정답은? : ");
			answer = scan.nextInt();
			
			if(answer > a)
				System.out.println("제시한 정수가 높습니다.");
			
			else if(answer < a)
				System.out.println("제시한 정수가 낮습니다.");
			
			else
			System.out.println("정답입니다! 시도횟수 = " +i);
		}
	}
}