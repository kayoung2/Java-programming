import java.util.Scanner;

public class TheaterReserve{
	public static void main(String [] args){
		int[] seat = {1,2,3,4,5,6,7,8,9,10};
		int[] person = {0,0,0,0,0,0,0,0,0,0};
		
		Scanner input = new Scanner(System.in);
		
		while(true){ // while(true)�� �ϸ� ���ǿ� ������� ��� �ݺ��ϰ� �ȴ�. C������ 1�� ����
		System.out.println("------------------------");
		
		for(int i=0;i<10;i++)
		{
			System.out.print(seat[i]+" ");
		}
		
		System.out.println(""); // �� �� ����ֱ� ����
		System.out.println("------------------------");
		
		for(int j=0;j<10;j++)
		{
			System.out.print(person[j]+" ");
		}
		
		System.out.println("");
		System.out.println("------------------------");
		
		System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
		int number = input.nextInt();
		
		if(number==-1)
			break;
		// break�� ���� �־�����Ѵ� �ֳ��ϸ� person[-2]�� ���� �����ϴ�!!!
		
		if(person[number-1]==0)
		{
			person[number-1]=1;
			
			System.out.println("����Ǿ����ϴ�.");
		}
		
		if(person[number-1]==1)
		{
			System.out.println("�̹� ����� �ڸ��Դϴ�.");
		}
		
		}
	}
}