import java.util.Scanner;

class Operator2{
	public static void main(String [] args){
		int a=7, b=-1, max;
		
		max = a>b?a:b;
		System.out.println("최댓값 : "+max);
		
		/*
		사용자에게 실수형 점수, 타입(문자형, 문자열: A/B)을 입력받고,
		타입이 A형이고, 70점 이상인 경우 합격을 출력하고,
		아니라면 불합격을 출력하는 프로그램을 삼항 연산자를 사용하여 작성
		*/
		
		Scanner scan = new Scanner(System.in);
		int grade;
		char type;
		
		System.out.print("점수: ");
		grade = scan.nextInt();
		
		System.out.print("타입 (A/B): ");
		type = scan.next().charAt(0); // 첫번째(0번째) 문자 입력받음
		
		int result = grade>=70 ? 1 :0;
		
		if(type=='A' && result==1)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격 입니다.");
		
		
		
		// 교수님이 하신 방법
		int grade2;
		char type2;
		// String type2;
		String pass;
		
		System.out.print("점수: ");
		grade2 = scan.nextInt();
		
		System.out.print("타입 (A/B): ");
		type2 = scan.next().charAt(0);
		// type2 = scan.next();
		
		pass = grade2>=70 && (type2=='A' || type2=='a')? "합격" : "불합격";
		// pass = grade2>=70 && type2=="A" ? "합격" : "불합격";
		
		/* 합격을 주어야 하는데 불합격이 나오는 이유는 기초 자료형은 ==으로 비교 가능
		But, 문자열같이 기초 자료형이 아닌 경우에는 ==으로 비교가 불가능 하다.
		
		pass = grade2>=70 && type2.equals("A") ? "합격" : "불합격";
		equals() 메소드를 사용해서 문자열 비교 가능 */
		
		System.out.println(pass);
	}
}