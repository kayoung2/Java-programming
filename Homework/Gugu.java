import java.util.Scanner;

class Gugu{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int i,j,k;
		int temp;
		temp=s.nextInt();
		
		for(i=2;i<=9;i+=temp){ // 2�ܺ��� 9�ܱ��� ������ i+temp!
			for(j=1;j<=9;j++){
				for(k=i;k<i+temp;k++){ // ���� temp�� 2�̸� 2�� 3�� �̷��� �Ǿ�� �ϱ� �����̴�.
					if(k>9) break;
					System.out.printf("%d*%d = %-4d",k,j,k*j);
				}
				System.out.println();
			}
		System.out.println();
		}
	}
}