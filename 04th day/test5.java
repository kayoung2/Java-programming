import java.util.Scanner;

class test5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��Ͻÿ�. ");
		int a = s.nextInt();
		int b;
		
		if(a>0)
			b=1;
		else if(a<0)
			b=-1;
		else
			/* ���࿡ else if(a==0)�� �Ѵٸ� �����Ϸ��� else�� ��쵵 ���� �Ŷ�� �����ϱ� ������ �������� �� �ȴ�. b�� �ʱ�ȭ ���� �ʱ� ������! */
			b=0;
		
		System.out.println(b);
	}
}