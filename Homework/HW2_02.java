import java.util.Scanner;

class HW2_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 지점 : ");
		double x1=s.nextDouble();
		double y1=s.nextDouble();
		
		System.out.print("두번째 지점 : ");
		double x2=s.nextDouble();
		double y2=s.nextDouble();
		
		if(x1==x2 || y1==y2)
		{
			System.out.println("직사각형이 아닙니다. 다시 입력해 주세요.");
			
			while(x1==x2 || y1==y2)
			{
				System.out.print("첫번째 지점 : ");
				x1=s.nextDouble();
				y1=s.nextDouble();
				
				System.out.print("두번째 지점 : ");
				x2=s.nextDouble();
				y2=s.nextDouble();
			}
		}
		
		
		double x=x2-x1;
		double y=y2-y1;
		
		if(x<0)
			x=x*(-1);
		if(y<0)
			y=y*(-1);
		
		double l=2*(x+y);
		double area=x*y;
		
		System.out.printf("이 직사각형의 둘레의 길이는 %.1f이고 넓이는 %.1f입니다.",l,area);
		
	}

}
