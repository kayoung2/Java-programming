import java.util.Scanner;
// Scanner ���� ���� ��!! ��1!!! ���� ���� ��

public class GCD{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		int x, y, r;
		
		System.out.print("�� ���� ������ �Է��ϼ���(ū��, ������) : ");
		
		x = myScanner.nextInt();
		y = myScanner.nextInt();
		
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		} /* �ִ����� ���ϴ� �˰��� �ٽ� �����غ���
		x = 36, y = 24 -> r = 12 -> x = 24, y = 12
		-> r = 0 -> x = 12, y = 0 */
		
		System.out.print("�ִ����� : " +x);
	}
}