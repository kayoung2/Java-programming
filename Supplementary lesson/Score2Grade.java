import java.util.Scanner;
// Scanner ���� ���� ��!! ��1!!! ���� ���� ��

public class Score2Grade{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		int score;
		char grade; // ���ڸ� �Է��� ���� char�� �̿�
		
		System.out.print("������ �Է��ϼ��� : ");
		
		score = myScanner.nextInt();
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("���� : "+grade);
	}
}