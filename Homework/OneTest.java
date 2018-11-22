import java.util.Scanner;
import java.io.*;

class OneTest{
	public static void main(String[] args){
		if(args.length<1){
			System.out.println("사용법: java OneTest 결과저장파일.java");
			System.exit(0);
		}
		
		File f = new File("원의 반지름과 넓이.java");
		File f2 = new File(args[0]);
		Circle[] circle = {new Circle(), new Circle(), new Circle()};
		
		if(f.exists()==false){
			System.out.println("원의 반지름과 넓이.java 파일이 존재하지 않습니다. 확인해주세요.");
			System.exit(0);
		}
		
		if(f2.exists()==true){
			System.out.println(args[0]+" 파일은 이미 존재합니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		try{
			Scanner s = new Scanner(f);
			int i=0;
			
			while(s.hasNext()==true){				
				circle[i].r = s.nextDouble();
				circle[i].area = s.nextDouble();
				i++;
			}
			s.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		
		try{
			PrintWriter pw = new PrintWriter(f2);
			
			for(int i=0;i<3;i++){
				if(circle[i].area == circle[i].r*circle[i].r*3.14)
					pw.println((i+1)+"번째 원의 넓이는 제대로 구해졌습니다: 반지름("+circle[i].r+"), 넓이("+circle[i].area+")");
				else
					pw.println((i+1)+"번째 원의 넓이는 잘 못 구해졌습니다: 반지름이 "+circle[i].r+"일 경우 넓이는 "+circle[i].area+"가 아니라 "+circle[i].r*circle[i].r*3.14+"입니다.");
			}
			pw.close();
		}catch(FileNotFoundException fnfe2){
			fnfe2.printStackTrace();
		}
		
		System.out.println("소스파일이 위치한 폴더에 결과 파일이 생성됐습니다. 확인해주세요.");
	}
}

class Circle{
	double r;
	double area;
}