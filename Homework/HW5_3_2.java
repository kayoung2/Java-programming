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
		
		System.out.print("���ڿ� 1 : ");
		String a = s.next();
		System.out.print("���ڿ� 2 : ");
		String b = s.next();
		
		System.out.println("���� 1�� ���� 2 ���� ��� : "+StringManipulate.connect(a,b));
		System.out.println("���� 1 �빮�� ��ȯ ��� : "+StringManipulate.big(a));
		System.out.println("���� 1�� ���� 2�� ��ġ ���� : "+StringManipulate.correct(a,b));
	}
}
