// ����ڷκ��� ������ �Է¹ް�, 1111�� �ԷµǸ� �Է��� �����. �׸��� �������� �Էµ� ������ ���� ��� (��, �������� �Էµ� 1111�� ����, 9�� ����� ����)

import java.util.Scanner;

class Sum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int sum=0, number; // do while �Լ� �ۿ��� sum, number�� ���̹Ƿ� �̸� �������־�� �Ѵ�.
		
		
		do{
			System.out.print("������ �Է��Ͻÿ�. ");
			number = s.nextInt();
			
			if(number%9==0)
				sum=sum;
			else
				sum+=number;
			
		}while(number!=1111);
		
		System.out.print("�� : "+(sum-1111)); // 1111���� ������ ���� sum�̹Ƿ� 1111���־�� �Ѵ�.
		
		
		/* �������� �Ͻô� �� ����..
		int input;
		
		while(true){
			System.out.print("���� : ");
			input = s.nextInt();
			
			if(input==1111) break;
			
			// if(input%9!=0) sum+=input;
			if(input%9==0) continue; // ���� ���� skip�ϰ� �ٷ� ó������
			
			sum += input;
		}
		
		System.out.println("�� : "+sum);
		
		*/
		
	}
}