class Test{
	public static void main(String [] args){
		printSum(3,4.2);
		System.out.printf("%.2f\n",product(2,5.4));
		System.out.println(correct("aBc","Abc"));
	}
	
	static void printSum(double a,double b){
		System.out.printf("%.2f\n",a+b); // ����ϴ� �޼ҵ�
	}
	static double product(double a,double b){
		return a*b; // ��ȯ�ϴ� �޼ҵ�
	}
	static boolean correct(String a,String b){
		return a.equalsIgnoreCase(b); // ��ҹ��ڸ� �����ϰ� a�� b�� ������ ����
	}
}