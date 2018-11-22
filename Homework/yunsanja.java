import java.util.Scanner;

class yunsanja{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력해주세요 : ");
		double a = s.nextDouble();
		
		System.out.print("수행할 연산자를 입력해주세요 : ");
		char b = s.next().charAt(0); // 첫 번째 문자만 입력받으므로 char
		
		System.out.print("두 번째 수를 입력해주세요 : ");
		double c = s.nextDouble();
		
		if(b=='+'){
			double d = a + c;
			
			if(d-(int)d==0)
				System.out.printf("%f + %f = %d", a,c,(int)d);
			// %d 쓰려면 정수타입 이어야 한다. 따라서 (int)해주어야 한다!
			else
				System.out.printf("%f + %f = %.2f", a,c,d);
		}
		else if(b=='-'){
			double d = a - c;
			
			if(d-(int)d==0)
				System.out.printf("%f - %f = %d", a,c,(int)d);
			else
				System.out.printf("%f - %f = %.2f", a,c,d);
		}
		else if(b=='*'){
			double d = a * c;
			
			if(d-(int)d==0)
				System.out.printf("%f * %f = %d", a,c,(int)d);
			else
				System.out.printf("%f * %f = %.2f", a,c,d);
		}
		else if(b=='%'){
			double d = a % c;
			
			if(c==0)
				System.out.printf("0으로 나눈 나머지는 구할 수 없습니다.");

			else if(d-(int)d==0)
				System.out.printf("%f %% %f = %d", a,c,(int)d); // %를 출력하려면 %%
			else
				System.out.printf("%f %% %f = %.2f", a,c,d);
		}
		else if(b=='/'){
			double d = a / c;
			

			if(c==0)
				System.out.print("0으로 나눌 수 없습니다.");
			
			else if(d-(int)d==0)
				System.out.printf("%f / %f = %d", a,c,(int)d);
			else
				System.out.printf("%f / %f = %.2f", a,c,d);
		}

		else
			System.out.print("[입력오류] +, -, *, /, % 연산만 지원합니다.");
	}
}