// 사용자 정의 예외: 300세 이상의 나이를 가질 경우 발생되는 예외!
import java.util.Scanner;

class LastTest{
	public static void main(String[] args){
		try{
			inputAge();
		}catch(TooManyAgeException tmae){
			System.out.println("300세 이상은 나이가 너무 많습니다.");
		}catch(NegativeAgeException nae){
			System.out.println("나이는 음수일 수 없습니다.");
		}
		System.out.println("프로그램 종료!");
	}
	
	static void inputAge() throws TooManyAgeException, NegativeAgeException{
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = s.nextInt();
		
		if(age>300) throw new TooManyAgeException();
		else if(age<0) throw new NegativeAgeException();
		else System.out.println("입력한 나이는 "+age+"세 입니다.");
	}
}

class TooManyAgeException extends Exception{
	TooManyAgeException(){
		super("300세 이상 나이 예외");
	}
}

class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("음수 나이 예외"); // Exception(이 예외에 대한 정보)
	}
}