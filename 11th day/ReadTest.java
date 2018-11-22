import java.util.Scanner;
import java.io.*;

class Student{
	String name;
	int age;
	double score;
}

class ReadTest{
	public static void main(String[] args){
		File f = new File("score.txt");
		Student[] students = {new Student(), new Student()};
		
		if(f.exists()==false){
			System.out.println("score.txt이 존재하지 않아 프로그램을 종료합니다.");
		System.exit(2);
		}
		
		int i=0;
		try{
			Scanner s = new Scanner(f);
			// 파일이 끝날 때까지 계속해서 읽어옴
			while(s.hasNext()){
				students[i].name = s.next();
				students[i].age = s.nextInt();
				students[i].score = s.nextDouble();
				i++;
				}
			s.close();
			}catch(FileNotFoundException fnfe){
				fnfe.printStackTrace();
			}
		
		for(i=0;i<students.length;i++){
			System.out.println("이름: "+students[i].name+", 나이: "+students[i].age+", 학점: "+students[i].score);
		}
	}
}