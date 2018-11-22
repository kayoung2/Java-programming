import java.util.Scanner;

public class Divisor{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("양의 정수를 입력하세요 : ");
		
		n = myScanner.nextInt();
		
		for(int i=1; i<=n ; i++)
		{
			if(n%i==0)
				System.out.print(""+i+" ");
		}
	}
}