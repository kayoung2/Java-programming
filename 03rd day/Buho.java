import java.util.Scanner;

class Buho{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하세요. ");
		number = s.nextInt();
		
		int buho = 1<<31;
		// 1<<31은 100..00000으로 맨 첫번째 비트
		// 0b100000...0000 (0b가 2진수)
		// 0x80000000 (16진수)
		// -2147483648
		// -Math.pow(2, 31)
		
		System.out.println(-Math.pow(2, 31));
		
		String pandan = ((number&buho)==buho?"음수":"양수");
		
		System.out.print(pandan);
	}
}