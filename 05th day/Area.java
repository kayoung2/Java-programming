// ���簢���� ����, ���θ� �޾� ���̸� ����Ѵ�. ��, ���� ���� �� �ϳ��� ������ ������ ����� �� ������ �ݺ��ؼ� �Է¹��� ��

import java.util.Scanner;

class Area{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int width, height, area;
		// ���� ��¹��� width, height, area�� �����Ƿ� �̸� �������־�� �Ѵ�.
		
		
		do{
			System.out.print("���� : ");
			width = s.nextInt();
			
			System.out.print("���� : ");
			height = s.nextInt();
		
		}while(width<=0 || height<=0); // �� �߿� �ϳ��� �����̸� �ݺ�, =<(x) <=(o)
		
		
		/*
		while(true){
			System.out.print("���� : ");
			width = s.nextInt();
		
			if(width>0) break;
		}
	
		while(true){
			System.out.print("���� : ");
			height = s.nextInt();

			if(height>0) break;
		}
		*/
	
		area = width*height;
		System.out.println("���ΰ� "+width+"�̰� ���ΰ� "+height+"�� ���簢���� ���̴� "+area+"�Դϴ�.");
	
	}
}