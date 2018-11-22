// ���� ���� ���α׷�
// java ReplaceTest �������ϸ�(args[0]) ��ü�����ϸ�(args[1]) ���ܾ� �Ŵܾ�
import java.io.*;
import java.util.Scanner;


class ReplaceTest{
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length<4){
			System.out.println("Usage: java ReplaceTest �������ϸ� ���纻���ϸ� ���ܾ� �Ŵܾ�");
			System.exit(1);
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
		
		String st, st1;
		while(s.hasNext()){
			st = s.nextLine(); // st���� ���ܾ �߰ߵ� ��� �Ŵܾ�� ��ü�����ϸ�
			st1 = st.replaceAll(args[2], args[3]);
			pw.println(st1);
		}
		
		s.close();
		pw.close();
		
		System.out.println(args[2]+"��(��) "+args[3]+"(��)�� ��ü �Ϸ�");
	}
}