import java.util.Scanner;

class Leekayoung{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("≥Ù¿Ã : ");
		int height = s.nextInt();
		
		for(int i=0;i<height;i++){
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0;j<height*2-(2*i+1);j++){
				if(j%2==0)
					System.out.print("+");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}