import java.util.Scanner;

class test2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("면허시험 종류 : ");
		String type = s.next();
		
		System.out.print("점수 : ");
		int grade = s.nextInt();
		
		if(type.equals("1종")){
			/* type은 기초변수가 아니라 참조형 변수로 type에는 실제로 내가 입력한 문자열이 있는 주소가 저장된다. 따라서 ==을 쓸 경우에는 내용을 비교하는 것이 아니라 참조값(주소)를 비교하게 된다.
			실제로 type=="1종" 이라는 식은 문자열의 주소와 1종이 같은지를 비교하는 것이다. 이를 해결하기 위해 type.equals("1종")을 하면 type의 주소의 문자열과 1종을 비교하게 된다. */
			/* 또는 type.charAt(0)을 사용할 경우 type의 첫번째 문자만 따오게 된다. 따라서 type.charAt(0)=='1'으로 하면 1종의 첫번째 문자인 1==1이 되어 식이 가능하게 된다. */
			if(grade>=70)
				System.out.println("1종 면허 시험 합격");
			else
				System.out.println("1종 면허 시험 불합격");
		}
		
		else if(type.equals("2종")){
			if(grade>=60)
				System.out.println("2종 면허 시험 합격");
			else
				System.out.println("2종 면허 시험 불합격");
		}
	}
}