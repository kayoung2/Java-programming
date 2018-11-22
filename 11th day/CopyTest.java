// 파일 복사 프로그램
// java CopyTest 원본파일명(args[0]) 복사본파일명(args[1])
import java.io.*;
import java.util.Scanner;


class CopyTest{
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length<2){
			System.out.println("Usage: java CopyTest 원본파일명 복사본파일명");
			System.exit(19);
		}
		
		File original = new File(args[0]);
		// original 파일이 없는 경우 종료
		if(!original.exists()){
			System.out.println("원본파일이 존재하지 않으므로 프로그램을 종료합니다.");
			System.exit(1);
		}
		
		File copy = new File(args[1]);
		// copy 파일이 이미 존재하는 경우 종료
		if(copy.exists()){
			System.out.println("복사본파일이 이미 존재하므로 프로그램을 종료합니다.");
			System.exit(1);
		}
		
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		
		String st;
		while(s.hasNext()){
			st = s.nextLine();
			pw.println(st);
			
			// pw.println(s.nextLine());
		}
		
		s.close();
		pw.close(); // 꼭 꼭 닫아주쎄용 ~
		
		System.out.println("파일 복사 완료");
	}
}