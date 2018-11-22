import java.util.Scanner;

public class CircleArea{
	public static void main(String [] args)
	{
		int r;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		r = myScanner.nextInt();
		
		double area = r*r*3.14; // pi라고 적으려면 미리 설정을 해주어야 함
		
		System.out.println(""+area+"");
		System.out.println("" +area);
		// 위의 두 방법은 area를 출력하는 같은 말임
	}
}