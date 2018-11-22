class Test{
	public static void main(String [] args){
		printSum(3,4.2);
		System.out.printf("%.2f\n",product(2,5.4));
		System.out.println(correct("aBc","Abc"));
	}
	
	static void printSum(double a,double b){
		System.out.printf("%.2f\n",a+b); // 출력하는 메소드
	}
	static double product(double a,double b){
		return a*b; // 반환하는 메소드
	}
	static boolean correct(String a,String b){
		return a.equalsIgnoreCase(b); // 대소문자를 무시하고 a와 b가 같은지 여부
	}
}