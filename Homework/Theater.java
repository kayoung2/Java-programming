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
		System.out.println("현재 예약 상태");
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
		
		System.out.println("예약을 하시겠습니까?(Y(y)/N(n))");
		char ans = s.next().charAt(0);
		char row;
		int col;
		int row2;
		
		if(ans=='y' || ans=='Y'){
			do{
				System.out.print("좌석의 행: ");
				row = s.next().charAt(0);
				row2 = ((int)row)-97;
				System.out.print("좌석의 열: ");
				col = s.nextInt();
				
				if(a[row2][col-1]!='X'){
					System.out.println(row+"열 "+col+"열 예약 성공!");
				}
				else System.out.println("이미 예약된 좌석입니다. 좌석을 다시 선택하세요.");
				
			}while(a[row2][col-1]=='X');
			
			a[row2][col-1]='X';
		}
		else return;
	}
}