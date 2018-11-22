import java.util.Scanner;
import java.io.*;

class ExceptionTest{
	public static void main(String[] args) throws FileNotFoundException{
		int x,y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("x: ");
		x = s.nextInt();
		
		System.out.print("y: ");
		y = s.nextInt();
		
		File abcFile = new File("abc.txt");
		
		/* ����ó��:
		 - try=catch�� ���� ���� ó��
		 - throws�� ���� Exception ���ѱ��
		*/
		Scanner fileScanner = new Scanner(abcFile); // ���� �߻� ����: FileNotFoundException
		
		System.out.printf("x+y = %d\n",x+y);
		System.out.printf("x-y = %d\n",x-y);
		System.out.printf("x/y = %d\n",x/y); // ����(���α׷� ���� ���� �߻��ϴ� ����) �߻�: ArithmeticException �߻�
		System.out.printf("x*y = %d\n",x*y);
	}
}