import java.util.Scanner;

public class QuadraticEq{
	public static void main(String[] args)
	{
		int b, c;
		
		
		Scanner myScanner = new Scanner(System.in);
		
		b = myScanner.nextInt();
		c = myScanner.nextInt();
		
		double x1=((-b)+Math.sqrt(b*b-4*c))/2;
		// ��Ʈ ����ϱ� ���ؼ� Math.sqrt() �޼ҵ� ���
		double x2=((-b)-Math.sqrt(b*b-4*c))/2;
		
		System.out.println("���� "+x1+"");
		System.out.println("���� "+x2+"");
	}
}