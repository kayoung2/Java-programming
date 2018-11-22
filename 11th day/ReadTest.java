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
			System.out.println("score.txt�� �������� �ʾ� ���α׷��� �����մϴ�.");
		System.exit(2);
		}
		
		int i=0;
		try{
			Scanner s = new Scanner(f);
			// ������ ���� ������ ����ؼ� �о��
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
			System.out.println("�̸�: "+students[i].name+", ����: "+students[i].age+", ����: "+students[i].score);
		}
	}
}