import java.util.Scanner;

class test2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("������� ���� : ");
		String type = s.next();
		
		System.out.print("���� : ");
		int grade = s.nextInt();
		
		if(type.equals("1��")){
			/* type�� ���ʺ����� �ƴ϶� ������ ������ type���� ������ ���� �Է��� ���ڿ��� �ִ� �ּҰ� ����ȴ�. ���� ==�� �� ��쿡�� ������ ���ϴ� ���� �ƴ϶� ������(�ּ�)�� ���ϰ� �ȴ�.
			������ type=="1��" �̶�� ���� ���ڿ��� �ּҿ� 1���� �������� ���ϴ� ���̴�. �̸� �ذ��ϱ� ���� type.equals("1��")�� �ϸ� type�� �ּ��� ���ڿ��� 1���� ���ϰ� �ȴ�. */
			/* �Ǵ� type.charAt(0)�� ����� ��� type�� ù��° ���ڸ� ������ �ȴ�. ���� type.charAt(0)=='1'���� �ϸ� 1���� ù��° ������ 1==1�� �Ǿ� ���� �����ϰ� �ȴ�. */
			if(grade>=70)
				System.out.println("1�� ���� ���� �հ�");
			else
				System.out.println("1�� ���� ���� ���հ�");
		}
		
		else if(type.equals("2��")){
			if(grade>=60)
				System.out.println("2�� ���� ���� �հ�");
			else
				System.out.println("2�� ���� ���� ���հ�");
		}
	}
}