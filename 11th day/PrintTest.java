// ���� ���: ���α׷� ����� ���Ͽ� ����: PrintWriter
// Hello, world!�� ���Ͽ� ���
/*
import java.io.File;
import java.io.PrintWriter;
*/
import java.io.*; // ioŬ���� ���� ��� Ŭ������ import
import java.util.Scanner;

class PrintTest{
	public static void main(String[] args){
		File f = new File("abc.txt");
		
		// ������ �̹� ������ ��� ���α׷� ����
		if(f.exists()){
			System.out.println("abc.txt ������ �̹� �����ؼ� ���α׷��� �����մϴ�.");
			// return;
			System.exit(1); // �ȿ� �ƹ� ���ڳ� �ִ´�
		}
		
		try{
			PrintWriter pw = new PrintWriter(f);
			pw.println("Hello, world!");
			pw.close(); // ���ϼ���!
		}catch(Exception e){
			e.printStackTrace();
		}
		
		File f1 = new File("def.txt");
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("�̸�: ");
		String name = s.next();
		System.out.print("����: ");
		int age = s.nextInt();
		
		try{
			try(PrintWriter pw1 = new PrintWriter(f1);){ // ���� pw1�� ���� �ʾƵ� �ڵ����� ������.
				pw1.println("�̸�: "+name+",����: "+age);
				// pw1.close(); // PrintWriter�� ���� ���ٸ� �������� �� �ݾ��ֱ�
			}
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}
	}
}