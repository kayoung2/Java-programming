class MethodTest{
	public static void main(String[] args){
		sumAB(3,7); // �޼ҵ� ȣ��
		// System.out.println(sumAB2(3,7));
		int a = sumAB2(3,7);
		System.out.println(a);
		
		double b = sumAB3(1.41,5.3463);
		System.out.println(b);
		
		sum(2);
		sum(2,2,3,4,5,5,1,243,5,6);
	}
	
	static void sumAB(int a, int b){ // �޼ҵ� ����, �ۼ� (��ȯ���� �ʰ� ��¸� �ϹǷ� void)
		System.out.printf("%d�� %d�� ���� %d�Դϴ�. \n",a,b,a+b);
	}
	
	static int sumAB2(int a, int b){ // main�� static�̱� ������ main�� �ٸ� �Լ����� ���� class�� �ٸ� �Լ��� static
		return a+b; // return �Լ��� �����(��ȯ��);
	}
	
	static double sumAB3(double a, double b){
		return a+b;
	}
	
	static void sum(int... a){ // �Ű�����(������) ��� ��� ó�� ����
		int sum=0; // ���� s�� ����
		
		for(int x:a){ // a = 2,2,3,4,5,5,1,243,5,6
			sum+=x;
		} // for-each ��
		
		System.out.println(sum);
	}
}