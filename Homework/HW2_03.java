import java.util.Scanner;

class HW2_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է� �Ͻÿ�. ");
		
		int grade = s.nextInt();
		
		if(grade>=90 && grade<=100)
			System.out.printf("\'��\'");
		else if(grade>=80 && grade<90)
			System.out.printf("\'��\'");
		else if(grade>=70 && grade<80)
			System.out.printf("\'��\'");
		else if(grade>=60 && grade<70)
			System.out.printf("\'��\'");
		else if(grade>=0 && grade<60)
			System.out.printf("\'��\'");
		else
			System.out.printf("0���� 100������ ������ �Է����ּ���.");
	}

}
