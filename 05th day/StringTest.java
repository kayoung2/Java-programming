// 시험 범위 : 4주차 강의자료 + 오늘 실습 내용까지 (all coding)
import java.util.Scanner;

class StringTest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String st = "No news is good news!";
		
		System.out.println("문장 st의 길이 : "+st.length()); // 문장 st의 길이 (공백 포함)
		System.out.println("문장 st의 6번째 문자 : "+st.charAt(5)); // 0번째부터 시작
		
		// 1. st에서 'w'의 개수??
		
		int number1=0;
		
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='w')
				number1++;
		}
		System.out.println("문장 st에서 'w'의 개수 : "+number1);
		
		// 2. st에서 'n', 'N'의 개수??
		
		int number2=0;
		
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='n' || st.charAt(i)=='N')
				number2++;
		}
		System.out.println("문장 st에서 'n'또는 'N'의 개수 : "+number2);
		
	}
}