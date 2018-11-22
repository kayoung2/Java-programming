import java.util.Scanner;

class Gugudan{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = s.nextInt();
		
		for(int i=2;i<=9;i+=n){ // 2단부터 9단까지, 처음 시작 2 그다음 시작 2+n
			for(int j=1;j<=9;j++){
				for(int k=0;k<n;k++){ // n번 출력해야 함, if) i=2라면 2단 3단 4단 이렇게 i+k!!
					if(i+k>9) break; // 9단 넘으면 안 됨
					System.out.printf("%d*%d = %-3d", i+k,j,(i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}