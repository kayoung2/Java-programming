import java.util.Scanner;

public class DoubleFloat{
	public static void main(String[] args){
		char gender; // ���� ����
		float f = 0.1f, f100 = 0, f10000 = 0;
		double d = 0.1, d100 = 0, d10000 = 0;
		
		// f(0.1)�� 100�� ���ϱ�! = 10
		/*
		f100=f100+f; // f100=0.1
		f100=f100+f; // f100=0.2
		f100=f100+f; // f100=0.3
		f100=f100+f; // f100=0.4
		*/
		/*
		for(�ʱ�ȭ;����;������){
			�ݺ��� ����
		}
		*/
		
		
		for(int i=0;i<100;i++){
			f100=f100+f;
		}
		System.out.println(f100);
		
		for(int j=0;j<100;j++){
			d100+=d;
		}
		System.out.println(d100);
		
		for(int i=0;i<10000;i++){
			f10000+=f;
		}
		System.out.println(f10000);
		
		for(int j=0;j<10000;j++){
			d10000+=d;
		}
		System.out.println(d10000);
		
		/* 0.1 floatŸ���� 100�� ���ϳ� doubleŸ���� 100�� ���ϳ� ���� 10���� ���;� �ϴµ�
		���� �ٸ��� ���´�. ����� �ݺ��Ǹ� �ݺ��ɼ��� ������ ���� Ŀ����.
		�׷����� floatŸ�Ժ��ٴ� doubleŸ���� ������ ���� ����. */
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("����(f/m): ");
		gender = s.next().charAt(0);
		/* next�� �����̳� \t ������ �о���Ƿ� ���� �ϳ��� �������� ���� �� �ִ�.
		���� charAt(0)�� �����ָ� 0��° (ù��°) ���ڸ� �о�´�.
		�迭�� 0���� �����ϹǷ� female�� 0��°�� f, 1��°�� e,... */
		
		System.out.println("������ "+gender+"�Դϴ�.");
		
		System.out.print("����(f/m): ");
		gender = s.next().charAt(2); // ����° ���ڸ� �д´�.
		System.out.println("������ "+gender+"�Դϴ�.");
	}
}