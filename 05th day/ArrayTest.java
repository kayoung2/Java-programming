// java 클래스명 ( ),( ), ( ),... -> args 배열

class ArrayTest{
	public static void main(String[] args){
		int[] intArr = {1,2,3,5,7,9}; // intArr : 배열명
		double[] dbleArray = {2.3,4.1,3.14}; // dbleArray : 배열명
		String[] st = {"Hi","Hello","abc"}; // st : 배열명
		// args : 커맨드(CMD) 라인에서 클래스 명 뒤에 적는 문자열들의 배열
		// 커맨드 라인에서 입력 받으시오. -> args 이용
		
		if(args.length<2){ // 프로그램 종료
			return;
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]); // 여기서 +는 연결의 의미, args[0]은 문자열이다.
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		// Integer.parseInt("문자열") : "문자열"을 정수 형태로 바꿔주라는 의미
		// ex)Integer.parseInt("3") : 문자열 "3"을 숫자 3으로 변경
		// Double.parseDouble("문자열") : "문자열"을 실수 형태로~
		
		System.out.println(st[2]);
		
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
		
		// length
		// 배열명.length
		// 문자열.length()
		
		System.out.println(intArr[5]);
		System.out.println(intArr.length); // 배열의 길이는 함수가 아니라 괄호 없이 length
		
		for(int i=0;i<dbleArray.length;i++)
			System.out.println(dbleArray[i]);
	}
}