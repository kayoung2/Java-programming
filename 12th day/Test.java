import java.util.Scanner;
import java.io.*;

class Test{
	public static void main(String[] args){
		int x,y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("x: ");
		x = s.nextInt();
		
		System.out.print("y: ");
		y = s.nextInt();
		
		File abcFile = new File("abc.txt");
		
		/* 예외처리:
		 - try=catch를 통해 직접 처리
		 - throws를 통해 Exception 떠넘기기
		*/
		try{
			Scanner fileScanner = new Scanner(abcFile); // 예외 발생 가능: FileNotFoundException
		
			System.out.printf("x+y = %d\n",x+y);
			System.out.printf("x-y = %d\n",x-y);
			System.out.printf("x/y = %d\n",x/y); // 예외(프로그램 실행 도중 발생하는 오류) 발생: ArithmeticException 발생
		}catch(ArithmeticException ae){
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(FileNotFoundException fnfe){
			System.out.println("abc.txt 파일을 찾을 수 없습니다.");
		}
		System.out.printf("x*y = %d\n",x*y);
	}
}