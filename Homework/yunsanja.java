import java.util.Scanner;

class yunsanja{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է����ּ��� : ");
		double a = s.nextDouble();
		
		System.out.print("������ �����ڸ� �Է����ּ��� : ");
		char b = s.next().charAt(0); // ù ��° ���ڸ� �Է¹����Ƿ� char
		
		System.out.print("�� ��° ���� �Է����ּ��� : ");
		double c = s.nextDouble();
		
		if(b=='+'){
			double d = a + c;
			
			if(d-(int)d==0)
				System.out.printf("%f + %f = %d", a,c,(int)d);
			// %d ������ ����Ÿ�� �̾�� �Ѵ�. ���� (int)���־�� �Ѵ�!
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
				System.out.printf("0���� ���� �������� ���� �� �����ϴ�.");

			else if(d-(int)d==0)
				System.out.printf("%f %% %f = %d", a,c,(int)d); // %�� ����Ϸ��� %%
			else
				System.out.printf("%f %% %f = %.2f", a,c,d);
		}
		else if(b=='/'){
			double d = a / c;
			

			if(c==0)
				System.out.print("0���� ���� �� �����ϴ�.");
			
			else if(d-(int)d==0)
				System.out.printf("%f / %f = %d", a,c,(int)d);
			else
				System.out.printf("%f / %f = %.2f", a,c,d);
		}

		else
			System.out.print("[�Է¿���] +, -, *, /, % ���길 �����մϴ�.");
	}
}