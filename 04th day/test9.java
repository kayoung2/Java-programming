import java.util.Scanner;

class test9{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int sum1=0;
		
		for(int i=1;i<11;i++)
			sum1+=i;
		
		System.out.println(sum1);
		
		int fac=1;
		int preFac=1;
		
		System.out.print("n!���� n : ");
		int n = s.nextInt();
		
		for(int j=1;j<n+1;j++){
			fac*=j; // factorial
			// System.out.println(j+"! = "+sum2);
			
			if(fac/j!=preFac)
				System.out.println(j+"!���� �����÷ο� �߻�");
			
			preFac=fac;
		}
		
		// (x+1)!/(x+1)=x!�� �ƴ϶�� �����÷ο찡 �߻��ߴ�.
	}
}