import java.util.Scanner;
import java.lang.Math;

public class NumberGame{
	public static void main(String [] args){
	   	int a = (int)(Math.random()*100); // ���� ���� � ���� �־���� ��
		
		int answer=101;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; a!=answer ;i++){ // ó���� answer�� ���� �־�� ��
			// for���� �߰��� ���ǽ��� ���̸� ����
			System.out.print("������? : ");
			answer = scan.nextInt();
			
			if(answer > a)
				System.out.println("������ ������ �����ϴ�.");
			
			else if(answer < a)
				System.out.println("������ ������ �����ϴ�.");
			
			else
			System.out.println("�����Դϴ�! �õ�Ƚ�� = " +i);
		}
	}
}