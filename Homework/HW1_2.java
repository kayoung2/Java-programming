import java.util.Scanner;

public class HW1_2{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�. ");
		String name = scan.next();
		System.out.print("���̸� �Է��Ͻÿ�. ");
		int age = scan.nextInt();
		System.out.print("�����Ը� �Է��Ͻÿ�. ");
		double weight = scan.nextDouble(); //�ؽŰ��� nextInt���� �� ��
		
		System.out.printf("\"���� �̸��� \'%S\',\n\n",name);
		System.out.printf("���̴� %#x,\n\n,",age);
		System.out.printf("\t�����Դ� %-10.3f �̴�.\"",weight);
		// �� 10ĭ�� �Ҽ� 3°�ڸ����� ����϶�� ��
	}
}