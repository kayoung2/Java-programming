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
		
		/* ����ó��:
		 - try=catch�� ���� ���� ó��
		 - throws�� ���� Exception ���ѱ��
		*/
		try{
			Scanner fileScanner = new Scanner(abcFile); // ���� �߻� ����: FileNotFoundException
		
			System.out.printf("x+y = %d\n",x+y);
			System.out.printf("x-y = %d\n",x-y);
			System.out.printf("x/y = %d\n",x/y); // ����(���α׷� ���� ���� �߻��ϴ� ����) �߻�: ArithmeticException �߻�
		}catch(ArithmeticException ae){
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}catch(FileNotFoundException fnfe){
			System.out.println("abc.txt ������ ã�� �� �����ϴ�.");
		}
		System.out.printf("x*y = %d\n",x*y);
	}
}