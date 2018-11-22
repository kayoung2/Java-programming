import java.util.Scanner;

class HW2_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수 하나를 입력 하시오. ");
		
		int grade = s.nextInt();
		
		if(grade>=90 && grade<=100)
			System.out.printf("\'수\'");
		else if(grade>=80 && grade<90)
			System.out.printf("\'우\'");
		else if(grade>=70 && grade<80)
			System.out.printf("\'미\'");
		else if(grade>=60 && grade<70)
			System.out.printf("\'양\'");
		else if(grade>=0 && grade<60)
			System.out.printf("\'가\'");
		else
			System.out.printf("0에서 100사이의 점수를 입력해주세요.");
	}

}
