import java.util.Scanner;

class susik{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("1���� ū �� : ");
		int a = s.nextInt();
		int b=1;
		
		
		if(a>1){
			
			System.out.print("1^2");
			// �� ������ if������ �� ��� ������ �Է����� ���� ��µȴ٤�
			
			for(int i=2;i<=a;i++){
				if(i%2!=0){
					b = b + (i*i);
					System.out.printf("+%d��",i);
				}
				else{
					b = b - (i*i);
					System.out.printf("-%d��",i);
				}
			}
			
			System.out.print("="+b); // for�� �ȿ� ���� ��� ����ؼ� ������� ��µ�.
		}
		
		else
			System.out.println("1���� ū ���� �Է��϶󱸿�!!");
	}
}