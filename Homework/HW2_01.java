import java.util.Scanner;

class HW2_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ͼ� �̸��� ���� �ϳ��� �Է��Ͻÿ�. ");
		int a = s.nextInt();
		
		int b=a/10000;
		a=a%10000;
		
		int c=a/1000;
		a=a%1000;
		
		int d=a/100;
		a=a%100;
		
		int e=a/10;
		a=a%10;
		
		if(b==0){
			System.out.printf("");
		}
		else if(b==1){
			System.out.printf("�� ");
		}
		else
			System.out.printf("%d�� ",b);
		
		if(c==0){
			System.out.printf("");
		}
		else if(c==1){
			System.out.printf("õ ");
		}
		else
			System.out.printf("%dõ ",c);
		if(d==0){
			System.out.printf("");
		}
		else if(d==1){
			System.out.printf("�� ");
		}
		else
			System.out.printf("%d�� ",d);
		if(e==0){
			System.out.printf("");
		}
		else if(e==1){
			System.out.printf("�� ");
		}
		else
			System.out.printf("%d�� ",e);
		if(a==0){
			System.out.printf("");
		}
		else
			System.out.printf("%d",a);
	}
}