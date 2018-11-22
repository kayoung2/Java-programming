import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int size;
		
		System.out.print("ÄÅÀÇ size: ");
		size = s.nextInt();
		
		if(size>=200)
			System.out.println("largeÄÅÀÔ´Ï´Ù.");
		else if(size>=100)
			System.out.println("mediumÄÅÀÔ´Ï´Ù.");
		else
			System.out.println("smallÄÅÀÔ´Ï´Ù.");
	}
}