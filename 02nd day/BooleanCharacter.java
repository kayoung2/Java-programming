public class BooleanCharacter{
	public static void main(String[] args){
		char a = 'h'; // ���ڴ� ���� ����ǥ �ȿ� ���� �ϳ���!!!
		char b = '\uac00'; // u�� �����ڵ带 �ǹ�, ac00�� ���� �ǹ�
		String h = "hello"; // ���ڿ��� ū ����ǥ �ȿ�
		boolean b1 = true;
		boolean b2 = 3>4;
		
		System.out.println(b1+" "+b2);
		System.out.println(b+"��");
	}
}