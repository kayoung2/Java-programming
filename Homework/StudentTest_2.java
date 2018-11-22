import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private double grade;
	
	Student(){}
	
	Student(String name,int age,double grade){
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setAge(int age){
		if(age>=0 && age<200) this.age = age;
		else this.age = 21;
	}
	
	int getAge(){
		return age;
	}
	
	void setGrade(double grade){
		if(grade>=0 && grade<=4.3) this.grade = grade;
		else this.grade = 3.98;
	}
	
	double getGrade(){
		return grade;
	}
}

class StudentTest_2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String name;
		int age;
		double grade;
		
		System.out.print("�̸� : ");
		name = s.next();
		System.out.print("���� : ");
		age = s.nextInt();
		System.out.print("���� : ");
		grade = s.nextDouble();
		
		Student st = new Student(name,age,grade);
		
		st.setGrade(4.26);
		System.out.println("�̸� : "+st.getName());
		System.out.println("���� : "+st.getGrade());
	}
}