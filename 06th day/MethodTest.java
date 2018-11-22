class MethodTest{
	public static void main(String[] args){
		sumAB(3,7); // 메소드 호출
		// System.out.println(sumAB2(3,7));
		int a = sumAB2(3,7);
		System.out.println(a);
		
		double b = sumAB3(1.41,5.3463);
		System.out.println(b);
		
		sum(2);
		sum(2,2,3,4,5,5,1,243,5,6);
	}
	
	static void sumAB(int a, int b){ // 메소드 구현, 작성 (반환하지 않고 출력만 하므로 void)
		System.out.printf("%d와 %d의 합은 %d입니다. \n",a,b,a+b);
	}
	
	static int sumAB2(int a, int b){ // main이 static이기 때문에 main과 다른 함수들이 같은 class라서 다른 함수도 static
		return a+b; // return 함수의 결과값(반환값);
	}
	
	static double sumAB3(double a, double b){
		return a+b;
	}
	
	static void sum(int... a){ // 매개변수(정수형) 몇개든 모두 처리 가능
		int sum=0; // 합을 s에 저장
		
		for(int x:a){ // a = 2,2,3,4,5,5,1,243,5,6
			sum+=x;
		} // for-each 문
		
		System.out.println(sum);
	}
}