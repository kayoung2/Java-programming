import java.util.Scanner;

class Degree{
	public static void main(String [] args){
		// È­¾¾->¼·¾¾, ¼·¾¾=((5/9)*(È­¾¾-32))
		double degree1, degree2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¼·¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. ");
		degree1 = scan.nextDouble();
		
		degree2=(degree1-32)*5/9;
		
		System.out.println("ÀÔ·ÂÇÏ½Å ¿Âµµ´Â È­¾¾ "+degree2+"µµ ÀÔ´Ï´Ù.");
	}
}