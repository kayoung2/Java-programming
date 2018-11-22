import java.util.Scanner;

class Theater{
	public static void main(String[] args){
		char[][] seat = new char[10][10];
		
		initial(seat);
		print(seat);
		reserve(seat);
		print(seat);
	}
	
	static void initial(char[][] a){
		int r=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				r=(int)(Math.random()*2);
				
				if(r==1) a[i][j]='X';
				else a[i][j]=' ';
			}
		}
	}
	
	static void print(char[][] a){
		System.out.println("���� ���� ����");
		System.out.printf("%4d",1);
		for(int i=2;i<11;i++) System.out.printf("%3d",i);
		System.out.println();
		for(int i=0;i<a[0].length;i++){
			System.out.printf("%c",i+97);
			for(int j=0;j<a.length;j++){
				System.out.printf("%3c",a[j][i]);
			}
			System.out.println();
		}
	}
	
	static void reserve(char[][] a){
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Ͻðڽ��ϱ�?(Y(y)/N(n))");
		char ans = s.next().charAt(0);
		char row;
		int col;
		int row2;
		
		if(ans=='y' || ans=='Y'){
			do{
				System.out.print("�¼��� ��: ");
				row = s.next().charAt(0);
				row2 = ((int)row)-97;
				System.out.print("�¼��� ��: ");
				col = s.nextInt();
				
				if(a[row2][col-1]!='X'){
					System.out.println(row+"�� "+col+"�� ���� ����!");
				}
				else System.out.println("�̹� ����� �¼��Դϴ�. �¼��� �ٽ� �����ϼ���.");
				
			}while(a[row2][col-1]=='X');
			
			a[row2][col-1]='X';
		}
		else return;
	}
}