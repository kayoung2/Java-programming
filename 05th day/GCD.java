import java.util.Scanner;

class GCD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오. ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int x,y,r;
		
		if(a>b){
			x = a; // 큰 수
			y = b; // 작은 수
		}
		else{
			x = a;
			y = b;
		}
		
		/*
		int a,b,tmp;
		
		if(b>a){ // a와 b를 교환하는 코드
			tmp = a;
			a = b;
			b = tmp;
		}
		*/
		
		do{
			r = x % y;
			x = y;
			y = r;
			
		}while(y!=0);
		
		/*
		while(true){
			r = x % y;
			x = y;
			y = r;
			
			if(r==0) break;
		}
		*/
		
		System.out.println("최대 공약수는 "+x+"입니다.");
	}
}