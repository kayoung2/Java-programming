import java.util.Scanner;

class Il111{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int a, b=0, sum=0;
		
		do{
			System.out.print("정수를 입력하세용 : ");
			a = s.nextInt();
			
			if(a%7!=0 && a!=1111){
				if(a%2!=0){
					sum+=a;
					b++; // 평균을 계산하기 위함
				}
			}
		}while(a!=1111);
		
		if(sum==0)
			System.out.print("평균을 계산할 홀수가 없습니다ㅠㅠ");
		else
			System.out.print((float)sum/b);
	}
}