import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int size;
		
		System.out.print("���� size: ");
		size = s.nextInt();
		
		if(size>=200)
			System.out.println("large���Դϴ�.");
		else if(size>=100)
			System.out.println("medium���Դϴ�.");
		else
			System.out.println("small���Դϴ�.");
	}
}