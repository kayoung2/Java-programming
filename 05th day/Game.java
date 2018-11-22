// 정답 79: 사용자가 한번만에 정답 맞추기 게임

import java.util.Scanner;

class Game{
	public static void main(String[] args){
		int answer=79;
		int number, tries=0;
		
		Scanner s = new Scanner(System.in);
		
		
		while(true){
			System.out.print("정답 : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("정답은 좀 더 큽니다.");
			else if(number>answer)
				System.out.println("정답은 좀 더 작습니다.");
			else{
				System.out.println("정답입니다. "+tries+"번만에 맞추셨습니다!");
				break;
			}
		}
		
		
		/*
		do{
			System.out.print("정답 : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("정답은 좀 더 큽니다.");
			else if(number>answer)
				System.out.println("정답은 좀 더 작습니다.");
			
			
		}while(number!=answer); // ;;;;!! 세미콜론!!
		
		System.out.println("정답입니다. "+tries+"번만에 맞추셨습니다!");
		*/
		
		/*
		System.out.print("정답 : ");
		number = s.nextInt();
		tries++;
		
		if(number<answer)
				System.out.println("정답은 좀 더 큽니다.");
		else if(number>answer)
			System.out.println("정답은 좀 더 작습니다.");
		else
			System.out.println("정답입니다. "+tries+"번만에 맞추셨습니다!");
		
		while(number!=answer){ // 답을 맞추지 못 했을 경우 반복
			System.out.print("정답 : ");
			number = s.nextInt();
			
			tries+=1;
			
			if(number<answer)
				System.out.println("정답은 좀 더 큽니다.");
			else if(number>answer)
				System.out.println("정답은 좀 더 작습니다.");
			else
				System.out.println("정답입니다. "+tries+"번만에 맞추셨습니다!");
				
		}
		*/
		
	}
}