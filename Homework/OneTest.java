import java.util.Scanner;
import java.io.*;

class OneTest{
	public static void main(String[] args){
		if(args.length<1){
			System.out.println("����: java OneTest �����������.java");
			System.exit(0);
		}
		
		File f = new File("���� �������� ����.java");
		File f2 = new File(args[0]);
		Circle[] circle = {new Circle(), new Circle(), new Circle()};
		
		if(f.exists()==false){
			System.out.println("���� �������� ����.java ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
			System.exit(0);
		}
		
		if(f2.exists()==true){
			System.out.println(args[0]+" ������ �̹� �����մϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		try{
			Scanner s = new Scanner(f);
			int i=0;
			
			while(s.hasNext()==true){				
				circle[i].r = s.nextDouble();
				circle[i].area = s.nextDouble();
				i++;
			}
			s.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		
		try{
			PrintWriter pw = new PrintWriter(f2);
			
			for(int i=0;i<3;i++){
				if(circle[i].area == circle[i].r*circle[i].r*3.14)
					pw.println((i+1)+"��° ���� ���̴� ����� ���������ϴ�: ������("+circle[i].r+"), ����("+circle[i].area+")");
				else
					pw.println((i+1)+"��° ���� ���̴� �� �� ���������ϴ�: �������� "+circle[i].r+"�� ��� ���̴� "+circle[i].area+"�� �ƴ϶� "+circle[i].r*circle[i].r*3.14+"�Դϴ�.");
			}
			pw.close();
		}catch(FileNotFoundException fnfe2){
			fnfe2.printStackTrace();
		}
		
		System.out.println("�ҽ������� ��ġ�� ������ ��� ������ �����ƽ��ϴ�. Ȯ�����ּ���.");
	}
}

class Circle{
	double r;
	double area;
}