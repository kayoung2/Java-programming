import java.util.Scanner;

class HW2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� 1���� �Է��Ͻÿ�. ");
		Scanner s = new Scanner(System.in);

		int a1,a2,a3,a4,n;
		
		
		
		
		a1 = s.nextInt();

		n = 1<<31;


		if((a1&n)==n)
		{
			a2=a1*(-1);
			a3=a2>>2;
			a4=a2-a3*4;
			System.out.format("\"%d�� �����Դϴ�. �� ���� ������ %d�̰�,\n\n\t�̸� 4�� ���� ���� %d�̰�,\n\n\t\t�������� %d�Դϴ�.\"",a1,a2,a3,a4);
			
		}

		else
		{
			a2=a1>>2;
			a3=a1-a2*4;
			System.out.format("\"%d�� ����Դϴ�. �� ���� ������ %d�̰�,\n\n\t�̸� 4�� ���� ���� %d�̰�,\n\n\t\t�������� %d�Դϴ�.\"",a1,a1,a2,a3);
			
		}
		
		
	}

}
