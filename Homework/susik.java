import java.util.Scanner;

class susik{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("1보다 큰 수 : ");
		int a = s.nextInt();
		int b=1;
		
		
		if(a>1){
			
			System.out.print("1^2");
			// 이 문구를 if밖으로 뺄 경우 음수를 입력했을 때도 출력된다ㅠ
			
			for(int i=2;i<=a;i++){
				if(i%2!=0){
					b = b + (i*i);
					System.out.printf("+%d²",i);
				}
				else{
					b = b - (i*i);
					System.out.printf("-%d²",i);
				}
			}
			
			System.out.print("="+b); // for문 안에 넣을 경우 계속해서 결과값이 출력됨.
		}
		
		else
			System.out.println("1보다 큰 수를 입력하라구요!!");
	}
}