import java.util.Scanner; // Scanner쓰기 위해서 !!!꼭!!! 적어줘야 함

public class Rectangle{
	public static void main(String[] args)
	{
		int w, h;
		
		
		Scanner myScanner = new Scanner(System.in);
		// Scanner 사용하기 위함
		
		System.out.print("사각형의 가로 크기 : ");
		w = myScanner.nextInt();
		
		System.out.print("사각형의 세로 크기 : ");
		h = myScanner.nextInt();
		
		double area = w*h; // 값이 초기화 되어 있기 전에 이 식을 적으면 안 됨
		double dul = 2*(w+h);
		
		System.out.println("사각형의 넓이 : " +area);
		System.out.println("사각형의 둘레 : " +dul);
		
	}
}