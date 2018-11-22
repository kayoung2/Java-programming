import java.util.Scanner;

class test1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = s.nextInt();
		
		if(n>=100)
			System.out.print("large");
		else
			System.out.print("small");
	}
}