import java.util.Scanner;

class Number{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.print("맞춰 보세요 : ");
		number = s.nextInt();
		
		int dap = (int)(Math.random()*100+1);
		
		if(number==dap)
			System.out.printf("%d : 정답입니다!!", dap);
		else if(number>dap)
			System.out.printf("정답보다 크네요. 정답 : %d", dap);
		else
			System.out.printf("정답보다 작네요. 정답 : %d", dap);
	}
}