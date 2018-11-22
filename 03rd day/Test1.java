import java.util.Scanner;

class Test1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("º¯¼ö n: ");
		n = s.nextInt();
		
		if(n>=100)
			System.out.println("large");
		else
			System.out.println("small");
	}
}