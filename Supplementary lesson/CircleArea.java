import java.util.Scanner;

public class CircleArea{
	public static void main(String [] args)
	{
		int r;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ��� : ");
		r = myScanner.nextInt();
		
		double area = r*r*3.14; // pi��� �������� �̸� ������ ���־�� ��
		
		System.out.println(""+area+"");
		System.out.println("" +area);
		// ���� �� ����� area�� ����ϴ� ���� ����
	}
}