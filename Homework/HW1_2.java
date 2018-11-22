import java.util.Scanner;

public class HW1_2{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오. ");
		String name = scan.next();
		System.out.print("나이를 입력하시오. ");
		int age = scan.nextInt();
		System.out.print("몸무게를 입력하시오. ");
		double weight = scan.nextDouble(); //붕신같이 nextInt하지 말 것
		
		System.out.printf("\"나의 이름은 \'%S\',\n\n",name);
		System.out.printf("나이는 %#x,\n\n,",age);
		System.out.printf("\t몸무게는 %-10.3f 이다.\"",weight);
		// 총 10칸에 소수 3째자리까지 출력하라는 말
	}
}