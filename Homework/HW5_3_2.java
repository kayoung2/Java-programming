import java.util.Scanner;

class StringManipulate{
	public static String connect(String a,String b){
		return a+b;
	}
	public static void big(String a){
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>='a' && a.charAt(i)<='z') System.out.print((char)(a.charAt(i)-32));
			else System.out.print(a.charAt(i));
		}
		System.out.println();
	}
	public static boolean correct(String a,String b){
		int l1,l2;
		boolean result = true;
		
		l1=a.length();
		l2=b.length();
		
		if(l1==l2){
			for(int i=0;i<l1;i++){
				if(a.charAt(i)!=b.charAt(i)){
					result = false;
					break;
				}
			}
		}
		else result = false;
		
		return result;
	}
}

public class HW5_3_2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String a,b;
		
		System.out.print("문자열 1 : ");
		String a = s.next();
		System.out.print("문자열 2 : ");
		String b = s.next();
		
		System.out.println("문장 1과 문장 2 연결 결과 : "+StringManipulate.connect(a,b));
		System.out.println("문장 1 대문자 변환 결과 : "+StringManipulate.big(a));
		System.out.println("문장 1과 문장 2의 일치 여부 : "+StringManipulate.correct(a,b));
	}
}
