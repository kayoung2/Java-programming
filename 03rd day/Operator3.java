import java.util.Scanner;

class Operator3{
	public static void main(String [] args){
		/*
		System.out.println(3&7);
		System.out.println(3|7);
		System.out.println(3^7);
		System.out.println(~7);
		*/
		
		/*
		����ڷκ��� ���� 1�� �Է� �޾� �� ���� ��Ʈ�� ǥ������ ��,
		1. ���� ������ ��Ʈ �Ǵ��ϱ�
		2. �����ʿ��� 3��° ��Ʈ �Ǵ��ϱ�
		*/
		
		Scanner s = new Scanner(System.in);
		
		int number;
		
		System.out.print("���� 1���� �Է��Ͻÿ�. ");
		number = s.nextInt();
		
		/*
		int result1 = number&1;
		System.out.println("�Է��Ͻ� ���� ���� ������ ��Ʈ�� "+result1+"�Դϴ�.");		
		*/
		
		// �������� �Ͻ� ���
		int pro1 = ((number&1)==1?1:0);
		System.out.println("�Է��Ͻ� ���� ���� ������ ��Ʈ�� "+pro1+"�Դϴ�.");
		
		/*
		int result2 = number&4;
		System.out.println("�Է��Ͻ� ���� �����ʿ��� 3��° ��Ʈ�� "+result2/4+"�Դϴ�.");
		*/
		
		//�������� �Ͻ� ���
		int pro2 = ((number&4)==4?1:0);
		System.out.println("�Է��Ͻ� ���� �����ʿ��� 3��° ��Ʈ�� "+pro2+"�Դϴ�.");
		}
}