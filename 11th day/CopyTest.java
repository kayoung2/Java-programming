// ���� ���� ���α׷�
// java CopyTest �������ϸ�(args[0]) ���纻���ϸ�(args[1])
import java.io.*;
import java.util.Scanner;


class CopyTest{
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length<2){
			System.out.println("Usage: java CopyTest �������ϸ� ���纻���ϸ�");
			System.exit(19);
		}
		
		File original = new File(args[0]);
		// original ������ ���� ��� ����
		if(!original.exists()){
			System.out.println("���������� �������� �����Ƿ� ���α׷��� �����մϴ�.");
			System.exit(1);
		}
		
		File copy = new File(args[1]);
		// copy ������ �̹� �����ϴ� ��� ����
		if(copy.exists()){
			System.out.println("���纻������ �̹� �����ϹǷ� ���α׷��� �����մϴ�.");
			System.exit(1);
		}
		
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		
		String st;
		while(s.hasNext()){
			st = s.nextLine();
			pw.println(st);
			
			// pw.println(s.nextLine());
		}
		
		s.close();
		pw.close(); // �� �� �ݾ��ֽ�� ~
		
		System.out.println("���� ���� �Ϸ�");
	}
}