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
		File f = new File("�ſ�����.txt");
		Person[] people = {new Person(), new Person(), new Person(), new Person()};
		
		if(!f.exists()){
			System.out.println("�ſ�����.txt�� �������� �ʾ� ���α׷��� �����մϴ�.");
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
		
		System.out.println("�ſ�����");
		System.out.println("====================================================");
		
		for(i=0;i<people.length;i++){
			System.out.println("����: "+people[i].country+", �̸�: "+people[i].name+", ����: "+people[i].age+", ������: "+people[i].weight);
		}
	}
}
*/


import java.io.*;
import java.util.Scanner;

class Identification{
	public static void main(String[] args) throws Exception{
		File f = new File("�ſ�����.txt");
		Scanner s = new Scanner(f);
		File f2 = new File("�ſ�����.java");
		PrintWriter pw = new PrintWriter(f2);
		
		pw.println("�ſ�����");
		pw.println("====================================================");
		pw.println();
		
		while(s.hasNext()){
			pw.println("����: "+s.next()+", �̸�: "+s.next()+", ����: "+s.nextInt()+", ������: "+s.nextDouble());
			pw.println();
		}
		
		s.close();
		pw.close();
		
		System.out.println("���� �ۼ� �Ϸ�!");
	}
}