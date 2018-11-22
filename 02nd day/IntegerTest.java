class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		//a를 세번 출력 : 10진수(decimal), 8진수(octal), 16진수(hexadecimal)
		
		System.out.printf("%d %o %X %h\n", a, a, a, a); // 변수 사이에 쉼표 넣을 것
		// %x대신에 %X를 적으면 대문자로 출력
		System.out.printf("%d %1$o %1$x\n", a); // 1$ 첫번째 인자를 출력하겠다는 말
		System.out.printf("%d %1$#o %1$#x\n", a); // $기호 뒤에 #을 붙이면 몇 진수인지 표현
		
		// a, b, c를 출력
		
		System.out.printf("%5d\t%5d\t%5d\n",a, b, c); // \t는 tap만큼 간격을 띄움
		System.out.format("%+5d\t%+-5d\t%5d\n",a, b, c); // printf와 format은 거의 동등하게 사용
		/* %와 5d 사이에 +를 넣을 경우 양수도 부호가 표시된다.
		%와 d사이의 숫자는 그만큼 간격을 확보하라는 뜻이다.
		%와 d사이의 -는 왼쪽 정렬을 의미한다. */
		
		// 서식 지정자 관련 과제 -> 위 내용 참고하고 따로 자료도 올려 주심
		
		float f = (float)3.14;
		float g = 3.14F;
		/* 3.14는 실수로 실수의 기본 타입인 double형으로 간주한다.
		따라서 double타입을 float에 넣으면 자료 손실이 발생하므로 에러가 발생한다.
		해결 방법 1 : casting (자료형)
		해결 방법 2 : 접미사 붙이기*/
		
		System.out.format("%5.2f %5.2f\n", f, g);
	}
}