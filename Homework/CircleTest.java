import java.util.Scanner;
import java.io.*;

public class CircleTest{
	public static void main(String [] args){		
		int radius, i=0;
		double area, calArea;
		final double PI = 3.14;
				
		if(args.length!=1){
			System.out.println("����: java CircleTest ��������������");
			return;
		}
		
		File input = new File("���� �������� ����.java");
		if(!input.exists()){
			System.out.println("���� �������� ����.java ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
			return;
		}
		
		File output = new File(args[0]);
		if(output.exists()){
			System.out.println(args[0]+" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���. ");
			return;
		}
		
		try{
			Scanner s = new Scanner(input);
			PrintWriter pw = new PrintWriter(output);
			
			while(s.hasNext()){
				i++;
				radius = s.nextInt();
				area = s.nextDouble();
				calArea = radius*radius*PI; 
				if(area==calArea) pw.printf("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)\n", i, radius, area);
				else pw.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�: �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�. \n", i, radius, area, calArea);
			}
			
			s.close();
			pw.close();
			
		}catch(FileNotFoundException e){
			System.out.println("���� �б� �Ǵ� ���⿡ �����߽��ϴ�. ");
			return;
		}
		
		System.out.println("�ҽ������� ��ġ�� ������ ��� ������ �����Ǿ����ϴ�. Ȯ���غ�����. ");
		
	}
}