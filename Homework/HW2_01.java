import java.util.Scanner;

class HW2_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("일억 미만의 정수 하나를 입력하시오. ");
		int a = s.nextInt();
		
		int b=a/10000;
		a=a%10000;
		
		int c=a/1000;
		a=a%1000;
		
		int d=a/100;
		a=a%100;
		
		int e=a/10;
		a=a%10;
		
		if(b==0){
			System.out.printf("");
		}
		else if(b==1){
			System.out.printf("만 ");
		}
		else
			System.out.printf("%d만 ",b);
		
		if(c==0){
			System.out.printf("");
		}
		else if(c==1){
			System.out.printf("천 ");
		}
		else
			System.out.printf("%d천 ",c);
		if(d==0){
			System.out.printf("");
		}
		else if(d==1){
			System.out.printf("백 ");
		}
		else
			System.out.printf("%d백 ",d);
		if(e==0){
			System.out.printf("");
		}
		else if(e==1){
			System.out.printf("십 ");
		}
		else
			System.out.printf("%d십 ",e);
		if(a==0){
			System.out.printf("");
		}
		else
			System.out.printf("%d",a);
	}
}