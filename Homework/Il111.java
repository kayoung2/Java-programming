import java.util.Scanner;

class Il111{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int a, b=0, sum=0;
		
		do{
			System.out.print("������ �Է��ϼ��� : ");
			a = s.nextInt();
			
			if(a%7!=0 && a!=1111){
				if(a%2!=0){
					sum+=a;
					b++; // ����� ����ϱ� ����
				}
			}
		}while(a!=1111);
		
		if(sum==0)
			System.out.print("����� ����� Ȧ���� �����ϴ٤Ф�");
		else
			System.out.print((float)sum/b);
	}
}