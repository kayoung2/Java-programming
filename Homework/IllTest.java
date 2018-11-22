import java.util.*;

class IllTest{
	public static void main(String[] args){
		try{
			inputNumberOfwork();
		}catch(NegativeWorkException nwe){
			System.out.println("업무수는 음수일 수 없습니다.");
		}catch(InputMismatchException ime){
			System.out.println("업무수는 아라비아 숫자로 입력해주세요.");
		}
		System.out.println("프로그램 종료!");
	}
	
	static void inputNumberOfwork() throws NegativeWorkException{
		Scanner s = new Scanner(System.in);
		
		double numberOfwork;
		
		System.out.print("총 업무 개수: ");
		numberOfwork = s.nextInt();
		
		if(numberOfwork<0) throw new NegativeWorkException();
		else System.out.println("한 사원의 최대 업무 수: "+(int)(Math.ceil(numberOfwork/10)));
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("음수 일 예외");
	}
}