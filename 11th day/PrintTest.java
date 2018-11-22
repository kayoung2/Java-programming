// 파일 출력: 프로그램 결과를 파일에 저장: PrintWriter
// Hello, world!를 파일에 출력
/*
import java.io.File;
import java.io.PrintWriter;
*/
import java.io.*; // io클래스 안의 모든 클래스를 import
import java.util.Scanner;

class PrintTest{
	public static void main(String[] args){
		File f = new File("abc.txt");
		
		// 파일이 이미 존재할 경우 프로그램 종료
		if(f.exists()){
			System.out.println("abc.txt 파일이 이미 존재해서 프로그램을 종료합니다.");
			// return;
			System.exit(1); // 안에 아무 숫자나 넣는다
		}
		
		try{
			PrintWriter pw = new PrintWriter(f);
			pw.println("Hello, world!");
			pw.close(); // 피일수우!
		}catch(Exception e){
			e.printStackTrace();
		}
		
		File f1 = new File("def.txt");
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("이름: ");
		String name = s.next();
		System.out.print("나이: ");
		int age = s.nextInt();
		
		try{
			try(PrintWriter pw1 = new PrintWriter(f1);){ // 내가 pw1을 닫지 않아도 자동으로 닫힌다.
				pw1.println("이름: "+name+",나이: "+age);
				// pw1.close(); // PrintWriter로 뭔갈 쓴다면 마지막에 꼭 닫아주기
			}
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}
	}
}