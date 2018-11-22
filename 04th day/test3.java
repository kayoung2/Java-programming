import java.util.Scanner;

class test3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("일한 시간 : ");
		int time = s.nextInt();
		
		if(time<8)
			System.out.println("임금 : "+time*5000);
		else
			System.out.println("임금 : "+(int)(((time-8)*5000*1.5)+(8*5000)));
		/* 1.5를 곱하면서 실수취급이 되므로 (int)를 해주었다.
		계산이 복잡할 때에는 괄호를 쳐주지 않으면 알아먹지 못함 ㅜㅜ */
	}
}