import java.util.Scanner;

class Number{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.print("���� ������ : ");
		number = s.nextInt();
		
		int dap = (int)(Math.random()*100+1);
		
		if(number==dap)
			System.out.printf("%d : �����Դϴ�!!", dap);
		else if(number>dap)
			System.out.printf("���亸�� ũ�׿�. ���� : %d", dap);
		else
			System.out.printf("���亸�� �۳׿�. ���� : %d", dap);
	}
}