import java.util.Scanner;

class test7{ // �����ﰢ��
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� : ");
		int a = s.nextInt();
	
		for(int i=0;i<a;i++){
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		/* �Ųٷ� �����ﰢ�� 10��, ���� i�� �� 10-i�� �ٳѱ� �� �� ��
		for(int k=0;k<10;k++){
			for(int l=0;l<k;l++)
				System.out.print(" ");
			for(int p=0;p<10-k;p++)
				System.out.print("*");
		System.out.println();
		} */
		
		System.out.print("�� : ");
		int b=s.nextInt();
		
		for(int k=0;k<b;k++){
			for(int l=0;l<k;l++)
				System.out.print(" ");
			for(int p=0;p<b-k;p++)
				System.out.print("*");
		System.out.println();
		
		}
	}
}