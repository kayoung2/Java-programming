// ���� ���� : 4���� �����ڷ� + ���� �ǽ� ������� (all coding)
import java.util.Scanner;

class StringTest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String st = "No news is good news!";
		
		System.out.println("���� st�� ���� : "+st.length()); // ���� st�� ���� (���� ����)
		System.out.println("���� st�� 6��° ���� : "+st.charAt(5)); // 0��°���� ����
		
		// 1. st���� 'w'�� ����??
		
		int number1=0;
		
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='w')
				number1++;
		}
		System.out.println("���� st���� 'w'�� ���� : "+number1);
		
		// 2. st���� 'n', 'N'�� ����??
		
		int number2=0;
		
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='n' || st.charAt(i)=='N')
				number2++;
		}
		System.out.println("���� st���� 'n'�Ǵ� 'N'�� ���� : "+number2);
		
	}
}