// Random number 생성
// 1. Math 클래스 사용(java.lang.Math)
import java.util.Scanner;

class RandomNumber{
	public static void main(String [] args){
		double randomNumber = Math.random();
		
		System.out.println(randomNumber);
		
		/* 1. 0이상 13미만의 실수형 난수
		   2. 0이상 13이하의 정수형 난수
		   3. 7이상 23미만의 정수형 난수
		   4. 반지름 입력받아서 원 둘레와 넓이 출력
		   3.14 = Math.PI */
		
		double num1 = Math.random()*13;
		int num2 = (int)(Math.random()*14);
		/* (int)Math.random()*13으로 할 경우 랜덤 수에 int를 한 후 *13을 해 0밖에 안 나옴
		(int)는 단항 연산자이기 때문에 먼저 실행해서 그렇게 된다.
		13이하의 정수는 13.9999를 정수로 바꾸어도 13이므로 14미만의 랜덤수를 뽑는다. */
		int num3 = (int)(Math.random()*16)+7;
		/* Math.random은 0이상 1미만이므로 13을 곱하면 0이상 13미만이 됨
		   마찬가지로 7을 더해주면 7이상 24미만이 됨 */
		
		System.out.print(num1+" "+num2+" "+num3+"\n");
		
		Scanner myScanner = new Scanner(System.in);
		double radius;
		
		System.out.print("반지름을 입력해주세요 : ");
		radius = myScanner.nextDouble();
		
		double length = radius*2*Math.PI;
		double area = radius*radius*Math.PI;
		
		System.out.println("반지름이 "+radius+"인 원의 둘레는 "+length+"이고, 넓이는 "+area+"이다.");
	}
}