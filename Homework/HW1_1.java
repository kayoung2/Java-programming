import java.util.Scanner;

public class HW1_1{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 양의 정수 : ");
		int a = scan.nextInt();
		
		System.out.print("두번째 양의 정수 : ");
		int b = scan.nextInt();
		
		System.out.println("");
		
		System.out.printf("%-11S|%-11S|%-11S|%-11S|\n","number","decimal","octal","hexadecimal");
		// %뒤에 -는 왼쪽 정렬을 11은 전체 출력 폭을 의미
		System.out.printf("%-11S|%+11d|%#11o|%#11x|\n","number 1",a,a,a);
		// %뒤에 #을 붙이면 진수를 표시해줌
		System.out.printf("%-11S|%+11d|%#11o|%#11x|\n","number 2",b,b,b);
		System.out.printf("%-11S|%-+11d|%#-11o|%#-11x|","sum",a+b,a+b,a+b);
	}
}