// 정수 두 개 입력받아 두 수의 평균을 출력
// test : 3,14로 테스트

import java.util.Scanner; // java.util이라는 폴더 안에 있는 Scanner class를 import 하겠다.
import java.util.Random; // java.util 패키지(폴더) 안의 Random class를 import 하겠다.
// 패키지 = 유사한 성질의 class들을 모아놓은 폴더

import java.util.*; // java.util 패키지에 존재하는 모든 class를 import 하겠다.
// java.lang 패키지에 존재하는 class들은 자동 import
// Math, System, String 등은 import하지 않아도 사용 가능하다.

class Operator{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); // 난수 생성기를 생성하고 ran으로 접근
		
		System.out.println(Math.pow(3,2));
		System.out.println(Math.sqrt(3)); // 제곱근 함수
		// 음수를 넣으면 ?? NaN(Not a Number)라고 뜬다.
		// Math.pow(a,b) = a의 b제곱
		
		System.out.println(ran.nextInt()); // int 범위의 난수
		System.out.println(ran.nextInt(6)); // 0-5까지의 정수형 난수, 6미만
		System.out.println(ran.nextInt(7)+17); // 17-23까지의 정수형 난수
		
// 오늘은 화요일 100일 후는 ?? 목요일
// 요일(숫자로 일:0, 월:1, 화:2, ...)을 입력받고 며칠 뒤가 무슨 요일인지 출력 
		
		System.out.print("오늘은 무슨 요일인가요? (일:0, 월:1, ... 토:6) : ");
		int c = scan.nextInt();
		
		System.out.print("며칠 뒤의 요일이 궁금하신가요? : ");
		int d = scan.nextInt();
		
		int e = c+(d%7);
		
		if(e>=7)
			e = e-7; // 7이 넘으면 switch구문 작동 불가
		else
			e = e;
		
		switch(e){
			case 0:
			System.out.printf("오늘로 부터 %d일 뒤는 일요일 입니다.\n", d);
			break;
			
			case 1:
			System.out.printf("오늘로 부터 %d일 뒤는 월요일 입니다.\n", d);
			break;
			
			case 2:
			System.out.printf("오늘로 부터 %d일 뒤는 화요일 입니다.\n", d);
			break;
			
			case 3:
			System.out.printf("오늘로 부터 %d일 뒤는 수요일 입니다.\n", d);
			break;
			
			case 4:
			System.out.printf("오늘로 부터 %d일 뒤는 목요일 입니다.\n", d);
			break;
			
			case 5:
			System.out.printf("오늘로 부터 %d일 뒤는 금요일 입니다.\n", d);
			break;
			
			case 6:
			System.out.printf("오늘로 부터 %d일 뒤는 토요일 입니다.\n", d);
			break;
		}
		
		
		int a,b;
		
		System.out.print("a : ");
		a = scan.nextInt();
		
		System.out.print("b : ");
		b = scan.nextInt();
		
		System.out.println("입력하신 두 수의 평균은 "+((double)a+b)/2+"입니다.");
		System.out.println(3+4); //7 덧셈의 의미
		System.out.println("A"+3+4); //A34 연결의 의미
		System.out.println('a'+'b'+3+4); // 각 문자의 ascii값과 정수의 합
	}
}