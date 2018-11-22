import java.util.Scanner;

class zzang{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("type : ");
		String type = s.next();

		

		if(type.equals("pyramid")){
			System.out.print("number : ");
			
			int a = s.nextInt();
			
			for(int i=0;i<a;i++){
				
				for(int j=0;j<a-i-1;j++)
					System.out.print(" ");
				for(int k=i;k>=-i;k--){
					// 첫번째 줄은 0부터 두번째 줄은 1부터... k번쨰 줄은 i부터
					if(k<0)
						System.out.print(-k);
					else
						System.out.print(k);
				}
			
			System.out.println();
			}
		}
		
		else if(type.equals("square")){
			System.out.print("column : ");
			int a = s.nextInt();
			
			System.out.print("row : ");
			int b = s.nextInt();
			
			System.out.print("how much : ");
			int c = s.nextInt();
			
			for(int i=0;i<b;i++){
				for(int j=0;j<c;j++){
					for(int k=0;k<b;k++)
						System.out.print("*");
					
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		else if(type.equals("diamond")){
			System.out.print("number : ");
			int a = s.nextInt();
			
			for(int i=0;i<a/2+1;i++){
				for(int j=0;j<a/2-i;j++)
					System.out.print(" ");
				for(int k=0;k<2*i+1;k++)
					System.out.print("*");
				
				System.out.println();
			}
			
			for(int p=0;p<a/2;p++){
				for(int q=0;q<p+1;q++)
					System.out.print(" ");
				for(int r=0;r<a-2*(p+1);r++)
					System.out.print("*");
				
				System.out.println();
			}
		}
	}
}