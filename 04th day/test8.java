// �Ųٷ� �Ƕ�̵� ������ �ϱ� !

import java.util.Scanner;

class test8{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� : ");
		int a = s.nextInt();
		
		for(int i=1;i<=a;i++){
			for(int j=0;j<a-i;j++)
				System.out.print(" ");
			for(int k=0;k<2*i-1;k++)
				System.out.print("*");
		System.out.println();
		}
	}
}