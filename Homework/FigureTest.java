class Figure{
	double length;
	double area;
	
}

class Circle extends Figure{
	double r;
	
	Circle(double r){
		super.length = 2*3.14*r;
		super.area = 3.14*r*r;
		
		this.r = r;
	}
	
	@Override
	public String toString(){
		return String.format("�� ������ Circle�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n�� ���� �������� %.1f�Դϴ�.\n",length,area,r);
	}
	
	@Override
	public boolean equals(Object obj){
		return this.r == ((Circle)obj).r;
	}
}

class EquilateralTriangle extends Figure{
	double a;
	double height;
	
	EquilateralTriangle(double a,double height){
		super.length = 3*a;
		super.area = a*height/2;
		
		this.a = a;
		this.height = height;
	}
	
	@Override
	public String toString(){
		return String.format("�� ������ EquilateralTriangle�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n�� �ﰢ���� �� ���� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n",length,area,a,height);
	}
}

class FigureTest{
	public static void main(String[] args){
		Circle one = new Circle(2);
		EquilateralTriangle sam = new EquilateralTriangle(2,1.73);
		
		System.out.println(one.toString());
		System.out.println(sam.toString());
		
		
		Circle two = new Circle(2);
		Circle three = new Circle(3);
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
	}
}