import java.util.Scanner;

class Buho{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.print("������ �Է��ϼ���. ");
		number = s.nextInt();
		
		int buho = 1<<31;
		// 1<<31�� 100..00000���� �� ù��° ��Ʈ
		// 0b100000...0000 (0b�� 2����)
		// 0x80000000 (16����)
		// -2147483648
		// -Math.pow(2, 31)
		
		System.out.println(-Math.pow(2, 31));
		
		String pandan = ((number&buho)==buho?"����":"���");
		
		System.out.print(pandan);
	}
}