import java.util.Scanner;

class Gugudan{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = s.nextInt();
		
		for(int i=2;i<=9;i+=n){ // 2�ܺ��� 9�ܱ���, ó�� ���� 2 �״��� ���� 2+n
			for(int j=1;j<=9;j++){
				for(int k=0;k<n;k++){ // n�� ����ؾ� ��, if) i=2��� 2�� 3�� 4�� �̷��� i+k!!
					if(i+k>9) break; // 9�� ������ �� ��
					System.out.printf("%d*%d = %-3d", i+k,j,(i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}