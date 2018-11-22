import java.util.Scanner;

public class QuadraticEq{
	public static void main(String[] args)
	{
		int b, c;
		
		
		Scanner myScanner = new Scanner(System.in);
		
		b = myScanner.nextInt();
		c = myScanner.nextInt();
		
		double x1=((-b)+Math.sqrt(b*b-4*c))/2;
		// 루트 계산하기 위해서 Math.sqrt() 메소드 사용
		double x2=((-b)-Math.sqrt(b*b-4*c))/2;
		
		System.out.println("근은 "+x1+"");
		System.out.println("근은 "+x2+"");
	}
}