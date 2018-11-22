import java.util.Scanner;

class PasswordTest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String pass = Password();
		
		System.out.print("비밀번호를 맞춰보세요 : ");
		String word = s.next();
		
		Correct(pass,word);
	}
	
	static String Password(){
		// int pass = ((int)(Math.random()*10)) + (((int)(Math.random()*10))*10) + (((int)(Math.random()*10))*100) + (((int)(Math.random()*10))*1000);
		String pass = "0721"; // 만약 비밀번호 0721으로 둘 경우 숫자 앞에 0이 붙어 8진법으로 인식함
		return pass;
	}
	
	static void Correct(String pass, String word){
		
		int password = Integer.parseInt(word);
		int password2 = Integer.parseInt(pass);
		
		
		if(password==password2) System.out.println("true");
		else System.out.println("false");
		
		System.out.print("비밀번호는 "+pass+"입니다!");
	}
}