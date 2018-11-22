import java.util.Scanner;

class test7{ // 직각삼각형
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("단 : ");
		int a = s.nextInt();
	
		for(int i=0;i<a;i++){
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		/* 거꾸로 직각삼각형 10단, 공백 i개 별 10-i개 줄넘김 꼭 할 것
		for(int k=0;k<10;k++){
			for(int l=0;l<k;l++)
				System.out.print(" ");
			for(int p=0;p<10-k;p++)
				System.out.print("*");
		System.out.println();
		} */
		
		System.out.print("단 : ");
		int b=s.nextInt();
		
		for(int k=0;k<b;k++){
			for(int l=0;l<k;l++)
				System.out.print(" ");
			for(int p=0;p<b-k;p++)
				System.out.print("*");
		System.out.println();
		
		}
	}
}