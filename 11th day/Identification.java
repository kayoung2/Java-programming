/*
import java.io.*;
import java.util.Scanner;

class Person{
	String country;
	String name;
	int age;
	double weight;
}

class Identification{
	public static void main(String[] args){
		File f = new File("신원정보.txt");
		Person[] people = {new Person(), new Person(), new Person(), new Person()};
		
		if(!f.exists()){
			System.out.println("신원정보.txt가 존재하지 않아 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		int i=0;
		try{
			Scanner s = new Scanner(f);
			
			while(s.hasNext()){
				people[i].country = s.next();
				people[i].name = s.next();
				people[i].age = s.nextInt();
				people[i].weight = s.nextDouble();
				i++;
			}
			s.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("신원정보");
		System.out.println("====================================================");
		
		for(i=0;i<people.length;i++){
			System.out.println("국적: "+people[i].country+", 이름: "+people[i].name+", 나이: "+people[i].age+", 몸무게: "+people[i].weight);
		}
	}
}
*/


import java.io.*;
import java.util.Scanner;

class Identification{
	public static void main(String[] args) throws Exception{
		File f = new File("신원정보.txt");
		Scanner s = new Scanner(f);
		File f2 = new File("신원정보.java");
		PrintWriter pw = new PrintWriter(f2);
		
		pw.println("신원정보");
		pw.println("====================================================");
		pw.println();
		
		while(s.hasNext()){
			pw.println("국적: "+s.next()+", 이름: "+s.next()+", 나이: "+s.nextInt()+", 몸무게: "+s.nextDouble());
			pw.println();
		}
		
		s.close();
		pw.close();
		
		System.out.println("파일 작성 완료!");
	}
}