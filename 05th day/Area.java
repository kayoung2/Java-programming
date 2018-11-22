// 직사각형의 가로, 세로를 받아 넓이를 출력한다. 단, 가로 세로 중 하나라도 음수가 들어오면 양수가 될 때까지 반복해서 입력받을 것

import java.util.Scanner;

class Area{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int width, height, area;
		// 밑의 출력문에 width, height, area가 나오므로 미리 선언해주어야 한다.
		
		
		do{
			System.out.print("가로 : ");
			width = s.nextInt();
			
			System.out.print("세로 : ");
			height = s.nextInt();
		
		}while(width<=0 || height<=0); // 둘 중에 하나라도 음수이면 반복, =<(x) <=(o)
		
		
		/*
		while(true){
			System.out.print("가로 : ");
			width = s.nextInt();
		
			if(width>0) break;
		}
	
		while(true){
			System.out.print("세로 : ");
			height = s.nextInt();

			if(height>0) break;
		}
		*/
	
		area = width*height;
		System.out.println("가로가 "+width+"이고 세로가 "+height+"인 직사각형의 넓이는 "+area+"입니다.");
	
	}
}