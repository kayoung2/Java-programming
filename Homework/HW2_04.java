import java.util.Scanner;

class HW2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 1개를 입력하시오. ");
		Scanner s = new Scanner(System.in);

		int a1,a2,a3,a4,n;
		
		
		
		
		a1 = s.nextInt();

		n = 1<<31;


		if((a1&n)==n)
		{
			a2=a1*(-1);
			a3=a2>>2;
			a4=a2-a3*4;
			System.out.format("\"%d은 음수입니다. 이 수의 절댓값은 %d이고,\n\n\t이를 4로 나눈 몫은 %d이고,\n\n\t\t나머지는 %d입니다.\"",a1,a2,a3,a4);
			
		}

		else
		{
			a2=a1>>2;
			a3=a1-a2*4;
			System.out.format("\"%d은 양수입니다. 이 수의 절댓값은 %d이고,\n\n\t이를 4로 나눈 몫은 %d이고,\n\n\t\t나머지는 %d입니다.\"",a1,a1,a2,a3);
			
		}
		
		
	}

}
