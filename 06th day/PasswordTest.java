import java.util.Scanner;

class PasswordTest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String pass = Password();
		
		System.out.print("��й�ȣ�� ���纸���� : ");
		String word = s.next();
		
		Correct(pass,word);
	}
	
	static String Password(){
		// int pass = ((int)(Math.random()*10)) + (((int)(Math.random()*10))*10) + (((int)(Math.random()*10))*100) + (((int)(Math.random()*10))*1000);
		String pass = "0721"; // ���� ��й�ȣ 0721���� �� ��� ���� �տ� 0�� �پ� 8�������� �ν���
		return pass;
	}
	
	static void Correct(String pass, String word){
		
		int password = Integer.parseInt(word);
		int password2 = Integer.parseInt(pass);
		
		
		if(password==password2) System.out.println("true");
		else System.out.println("false");
		
		System.out.print("��й�ȣ�� "+pass+"�Դϴ�!");
	}
}