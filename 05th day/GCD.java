import java.util.Scanner;

class GCD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�. ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int x,y,r;
		
		if(a>b){
			x = a; // ū ��
			y = b; // ���� ��
		}
		else{
			x = a;
			y = b;
		}
		
		/*
		int a,b,tmp;
		
		if(b>a){ // a�� b�� ��ȯ�ϴ� �ڵ�
			tmp = a;
			a = b;
			b = tmp;
		}
		*/
		
		do{
			r = x % y;
			x = y;
			y = r;
			
		}while(y!=0);
		
		/*
		while(true){
			r = x % y;
			x = y;
			y = r;
			
			if(r==0) break;
		}
		*/
		
		System.out.println("�ִ� ������� "+x+"�Դϴ�.");
	}
}