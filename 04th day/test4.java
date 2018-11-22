/* switch(변수)<-문자형 String, 정수 int 
case 정수 : 실행할 문장, But case 1,2 : 이렇게 생략은 하지 못 함
하고 싶다면 case 1 : case 2 : 실행할 문장 이렇게 사용 가능
switch문에서 break를 쓰지 않으면 해당되는 case밑으로 다~ 출력됨 */

import java.util.Scanner;

class test4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 요일 ? ");
		String day = s.next();
		int date;
		
		System.out.print("몇일 뒤? ");
		int next = s.nextInt();
		
		switch(day){
			case "일요일":
			date=0;
			break;
			
			case "월요일":
			date=1;
			break;
			
			case "화요일":
			date=2;
			break;
			
			case "수요일":
			date=3;
			break;
			
			case "목요일":
			date=4;
			break;
			
			case "금요일":
			date=5;
			break;
			
			case "토요일":
			date=6;
			break;
			
			default:
			System.out.print("[입력오류] 프로그램을 종료합니다.");
			return; // System.exit(); -> 프로그램 종료, But date초기화 해줘야함
			/* return은 함수를 종료하는 명령어 (main함수를 종료)
			메소드를 종료하는 키워드! 여기서는 main() 메소드를 종료하는 의미! */
		}
		
		switch((date+next)%7){
			case 0:
			day="일요일";
			break;
			
			case 1:
			day="월요일";
			break;
			
			case 2:
			day="화요일";
			break;
			
			case 3:
			day="수요일";
			break;
			
			case 4:
			day="목요일";
			break;
			
			case 5:
			day="금요일";
			break;
			
			case 6:
			day="토요일";
			break;
		}
		
		System.out.println("오늘로 부터 "+next+"일 후는 "+day+"입니다.");
		
	}
}