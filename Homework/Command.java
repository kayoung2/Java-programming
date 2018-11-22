import java.util.Scanner;

class Command{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		if(args.length<1){
			// args.length는 args 배열의 크기, 함수가 아니라서 () 안 붙임
			System.out.println("[입력오류] 하나의 영단어를 입력하지 않아 프로그램을 종료합니다.");
			return;
		}
		
		int ja=0;
		int mo=0;
		
		for(int i=0;i<args[0].length();i++){
			// args[0].length는 args[0] 문자열의 크기라 () 붙임
			if(((args[0].charAt(i)>='A')&&(args[0].charAt(i)<='Z'))||((args[0].charAt(i)>='a')&&(args[0].charAt(i)<='z'))){
				switch(args[0].charAt(i)){
					case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o':
					case 'U': case 'u':
					mo++;
					break;
					
					default:
					ja++;
					break;
				}
			}
		}
		
		System.out.println("자음 개수: "+ja);
		System.out.println("모음 개수: "+mo);
	}
}