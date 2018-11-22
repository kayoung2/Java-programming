import java.util.Scanner;

class ReservationTest{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		boolean [][] seats = new boolean[10][10];
		initSeats(seats);
		showSeats(seats);
		char reservation;
		while(true){
			System.out.print("�����Ͻðڽ��ϱ�(Y,y/N,n)?");
			reservation = s.next().charAt(0);
			if(reservation=='Y'||reservation=='y') reserve(seats);
			else if(reservation=='N'||reservation=='n'){
				System.out.println("����ý����� �����մϴ�.");
				break;
			}
			else System.out.println("Y(y) �Ǵ� N(n)���� �Է����ּ���.");			
		}
	}
	
	public static void initSeats(boolean [][] seats){
		int x;
		for(int i=0; i<seats.length; i++){
			for(int j=0; j<seats[i].length; j++){
				x = (int)(Math.random()*2);
				if(x==0) seats[i][j] = false;
				else seats[i][j] = true;
			}
		}
	}

	public static void showSeats(boolean [][] seats){
		System.out.printf("  ");
		for(int i=0; i<seats[0].length; i++) System.out.printf("%2d ", i+1);
		System.out.println();
		for(int i=0; i<seats.length; i++){
			System.out.printf("%c ", i+'a');
			for(int j=0; j<seats[i].length; j++){
				if(seats[i][j]==true) System.out.printf(" X ");
				else System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static void reserve(boolean [][] seats){
		int row, col;
		char tmp;
		while(true){
			while(true){
				System.out.print("�� ��? ");
				tmp = s.next().toLowerCase().charAt(0);//����ڰ� �Է��� ���ڿ��� �ҹ��ڷ� ��� �ٲ� �� ù��° ���ڸ� ���ؼ� tmp�� ����
				if(tmp>='a'&&tmp<='j') break;
				System.out.println("���� a���� j������ �����ڷ� �Է����ּ���.");
			}
			
			row = (int)(tmp-'a');
			
			while(true){
				System.out.print("�� ��? ");
				col = s.nextInt();
				if(col>=1&&col<=seats.length) break;
				System.out.printf("���� 1���� %d������ ������ �Է����ּ���.\n", seats.length);
			}
			
			if(seats[row][col-1]==false){
				seats[row][col-1] = true;
				System.out.printf("%c�� %d�� ���࿡ �����Ͽ����ϴ�.\n", tmp, col);
				showSeats(seats);
				break;
			}else{
				System.out.println("�̹� ����� �¼��Դϴ�. �ٸ� �¼��� �����ϼ���.");
			}
		}
	}
}