import java.util.Scanner;

class Gugu{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int i,j,k;
		int temp;
		temp=s.nextInt();
		
		for(i=2;i<=9;i+=temp){ // 2단부터 9단까지 시작은 i+temp!
			for(j=1;j<=9;j++){
				for(k=i;k<i+temp;k++){ // 만약 temp가 2이면 2단 3단 이렇게 되어야 하기 때문이다.
					if(k>9) break;
					System.out.printf("%d*%d = %-4d",k,j,k*j);
				}
				System.out.println();
			}
		System.out.println();
		}
	}
}