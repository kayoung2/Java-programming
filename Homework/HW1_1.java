import java.util.Scanner;

public class HW1_1{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù���� ���� ���� : ");
		int a = scan.nextInt();
		
		System.out.print("�ι�° ���� ���� : ");
		int b = scan.nextInt();
		
		System.out.println("");
		
		System.out.printf("%-11S|%-11S|%-11S|%-11S|\n","number","decimal","octal","hexadecimal");
		// %�ڿ� -�� ���� ������ 11�� ��ü ��� ���� �ǹ�
		System.out.printf("%-11S|%+11d|%#11o|%#11x|\n","number 1",a,a,a);
		// %�ڿ� #�� ���̸� ������ ǥ������
		System.out.printf("%-11S|%+11d|%#11o|%#11x|\n","number 2",b,b,b);
		System.out.printf("%-11S|%-+11d|%#-11o|%#-11x|","sum",a+b,a+b,a+b);
	}
}