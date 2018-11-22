import java.util.Scanner;

class test5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하시오. ");
		int a = s.nextInt();
		int b;
		
		if(a>0)
			b=1;
		else if(a<0)
			b=-1;
		else
			/* 만약에 else if(a==0)로 한다면 컴파일러가 else인 경우도 있을 거라고 생각하기 때문에 컴파일이 안 된다. b가 초기화 되지 않기 때문에! */
			b=0;
		
		System.out.println(b);
	}
}