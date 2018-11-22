import java.util.Scanner;
// Scanner 쓰기 위해 꼭!! 꼮1!!! 제발 적을 것

public class GCD{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		int x, y, r;
		
		System.out.print("두 개의 정수를 입력하세요(큰수, 작은수) : ");
		
		x = myScanner.nextInt();
		y = myScanner.nextInt();
		
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		} /* 최대공약수 구하는 알고리즘 다시 생각해보기
		x = 36, y = 24 -> r = 12 -> x = 24, y = 12
		-> r = 0 -> x = 12, y = 0 */
		
		System.out.print("최대공약수 : " +x);
	}
}