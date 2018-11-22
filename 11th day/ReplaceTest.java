// 파일 복사 프로그램
// java ReplaceTest 원본파일명(args[0]) 교체본파일명(args[1]) 구단어 신단어
import java.io.*;
import java.util.Scanner;


class ReplaceTest{
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length<4){
			System.out.println("Usage: java ReplaceTest 원본파일명 복사본파일명 구단어 신단어");
			System.exit(1);
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
		
		String st, st1;
		while(s.hasNext()){
			st = s.nextLine(); // st에서 구단어가 발견될 경우 신단어로 교체본파일명
			st1 = st.replaceAll(args[2], args[3]);
			pw.println(st1);
		}
		
		s.close();
		pw.close();
		
		System.out.println(args[2]+"을(를) "+args[3]+"(으)로 교체 완료");
	}
}