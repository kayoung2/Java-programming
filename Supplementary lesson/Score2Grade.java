import java.util.Scanner;
// Scanner 쓰기 위해 꼭!! 꼮1!!! 제발 적을 것

public class Score2Grade{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		int score;
		char grade; // 문자를 입력할 때는 char을 이용
		
		System.out.print("성적을 입력하세요 : ");
		
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
		
		System.out.println("학점 : "+grade);
	}
}