import java.util.Scanner; // Scanner���� ���ؼ� !!!��!!! ������� ��

public class Rectangle{
	public static void main(String[] args)
	{
		int w, h;
		
		
		Scanner myScanner = new Scanner(System.in);
		// Scanner ����ϱ� ����
		
		System.out.print("�簢���� ���� ũ�� : ");
		w = myScanner.nextInt();
		
		System.out.print("�簢���� ���� ũ�� : ");
		h = myScanner.nextInt();
		
		double area = w*h; // ���� �ʱ�ȭ �Ǿ� �ֱ� ���� �� ���� ������ �� ��
		double dul = 2*(w+h);
		
		System.out.println("�簢���� ���� : " +area);
		System.out.println("�簢���� �ѷ� : " +dul);
		
	}
}