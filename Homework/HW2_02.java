import java.util.Scanner;

class HW2_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		double x1=s.nextDouble();
		double y1=s.nextDouble();
		
		System.out.print("�ι�° ���� : ");
		double x2=s.nextDouble();
		double y2=s.nextDouble();
		
		if(x1==x2 || y1==y2)
		{
			System.out.println("���簢���� �ƴմϴ�. �ٽ� �Է��� �ּ���.");
			
			while(x1==x2 || y1==y2)
			{
				System.out.print("ù��° ���� : ");
				x1=s.nextDouble();
				y1=s.nextDouble();
				
				System.out.print("�ι�° ���� : ");
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
		
		System.out.printf("�� ���簢���� �ѷ��� ���̴� %.1f�̰� ���̴� %.1f�Դϴ�.",l,area);
		
	}

}
