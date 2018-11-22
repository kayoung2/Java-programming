import java.util.Scanner;

public class DoubleFloat{
	public static void main(String[] args){
		char gender; // 변수 선언
		float f = 0.1f, f100 = 0, f10000 = 0;
		double d = 0.1, d100 = 0, d10000 = 0;
		
		// f(0.1)을 100번 더하기! = 10
		/*
		f100=f100+f; // f100=0.1
		f100=f100+f; // f100=0.2
		f100=f100+f; // f100=0.3
		f100=f100+f; // f100=0.4
		*/
		/*
		for(초기화;조건;증감문){
			반복할 문장
		}
		*/
		
		
		for(int i=0;i<100;i++){
			f100=f100+f;
		}
		System.out.println(f100);
		
		for(int j=0;j<100;j++){
			d100+=d;
		}
		System.out.println(d100);
		
		for(int i=0;i<10000;i++){
			f10000+=f;
		}
		System.out.println(f10000);
		
		for(int j=0;j<10000;j++){
			d10000+=d;
		}
		System.out.println(d10000);
		
		/* 0.1 float타입을 100번 더하나 double타입을 100번 더하나 값이 10으로 나와야 하는데
		값이 다르게 나온다. 계산이 반복되면 반복될수록 오차가 점점 커진다.
		그렇지만 float타입보다는 double타입이 오차가 적게 난다. */
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("성별(f/m): ");
		gender = s.next().charAt(0);
		/* next는 공백이나 \t 전까지 읽어오므로 문자 하나만 가져오지 않을 수 있다.
		따라서 charAt(0)을 적어주면 0번째 (첫번째) 문자만 읽어온다.
		배열은 0부터 시작하므로 female의 0번째는 f, 1번째는 e,... */
		
		System.out.println("성별은 "+gender+"입니다.");
		
		System.out.print("성별(f/m): ");
		gender = s.next().charAt(2); // 세번째 문자를 읽는다.
		System.out.println("성별은 "+gender+"입니다.");
	}
}