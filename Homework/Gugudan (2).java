import java.util.Scanner;
//break; �� ���
class Gugudan{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int col;
		System.out.print("�� ����?? ");
		col=s.nextInt();
		
		for(int i=0; col*i<8;i++){ //2�ܺ��� 9�ܱ��� �� 8���̱� ������ 8�� �ݺ��ϰ� ������
			for(int j=1; j<=9; j++){
				for(int k=2+col*i; k<2+col*(i+1);k++){
					if(k<=9)	System.out.printf("%d X %d = %2d\t", k, j, k*j);
				}
				System.out.println();
			}
			for(int j = 0; j<col; j++) System.out.print("-----------------");
			System.out.println("\n");
				
		}
		
	}
}