// java Ŭ������ ( ),( ), ( ),... -> args �迭

class ArrayTest{
	public static void main(String[] args){
		int[] intArr = {1,2,3,5,7,9}; // intArr : �迭��
		double[] dbleArray = {2.3,4.1,3.14}; // dbleArray : �迭��
		String[] st = {"Hi","Hello","abc"}; // st : �迭��
		// args : Ŀ�ǵ�(CMD) ���ο��� Ŭ���� �� �ڿ� ���� ���ڿ����� �迭
		// Ŀ�ǵ� ���ο��� �Է� �����ÿ�. -> args �̿�
		
		if(args.length<2){ // ���α׷� ����
			return;
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]); // ���⼭ +�� ������ �ǹ�, args[0]�� ���ڿ��̴�.
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		// Integer.parseInt("���ڿ�") : "���ڿ�"�� ���� ���·� �ٲ��ֶ�� �ǹ�
		// ex)Integer.parseInt("3") : ���ڿ� "3"�� ���� 3���� ����
		// Double.parseDouble("���ڿ�") : "���ڿ�"�� �Ǽ� ���·�~
		
		System.out.println(st[2]);
		
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
		
		// length
		// �迭��.length
		// ���ڿ�.length()
		
		System.out.println(intArr[5]);
		System.out.println(intArr.length); // �迭�� ���̴� �Լ��� �ƴ϶� ��ȣ ���� length
		
		for(int i=0;i<dbleArray.length;i++)
			System.out.println(dbleArray[i]);
	}
}