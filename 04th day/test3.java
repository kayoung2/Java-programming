import java.util.Scanner;

class test3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ð� : ");
		int time = s.nextInt();
		
		if(time<8)
			System.out.println("�ӱ� : "+time*5000);
		else
			System.out.println("�ӱ� : "+(int)(((time-8)*5000*1.5)+(8*5000)));
		/* 1.5�� ���ϸ鼭 �Ǽ������ �ǹǷ� (int)�� ���־���.
		����� ������ ������ ��ȣ�� ������ ������ �˾Ƹ��� ���� �̤� */
	}
}