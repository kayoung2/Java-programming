import java.util.Scanner;

class Gugudan{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 단부터 몇 단까지 : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		for(int i=a;i<=b;i++)
			System.out.print("---"+i+"단--- ");
		
		System.out.println();
		
		for(int i=1;i<10;i++){
			for(int j=a;j<=b;j++){
				System.out.printf("%d X %d =%2d ", j,i,j*i);
			}
			System.out.println();
		}
		
	}
}