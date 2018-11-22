import java.util.Scanner;

class test10{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력할 단 : ");
		int a = s.nextInt();
		
		System.out.println("----"+a+"단----");
		for(int i=1;i<10;i++)
			System.out.println(a+" X "+i+" = "+(a*i));
		
		for(int j=1;j<11;j++)
			System.out.print(j+" ");
	}
}