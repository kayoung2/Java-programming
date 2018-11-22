import java.util.Scanner;

class test11{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("´Ü : ");
		int a = s.nextInt();
		
		 for(int i=0;i<a;i++){
			 for(int j=0;j<a-i;j++)
				 System.out.print(" ");
			 for(int k=0;k<=i;k++)
				 System.out.print("*");
			System.out.println();
		 }
	}
}