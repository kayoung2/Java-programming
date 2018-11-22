class Student{
	private String name;
	private int age;
	private double grade;
	
	Student(){
		this("서메롱",5,4.21);
	}
	
	Student(String name,int age,double grade){
		this.name = name;
		
		if(age>=0 && age<200) this.age = age;
		else this.age = 21;
		
		if(grade>=0 && grade<=4.3) this.grade = grade;
		else this.grade = 3.98;
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

class StudentTest{
	public static void main(String[] args){
		Student a = new Student();
		
		System.out.println("학생 a의 이름 : "+a.getName()+", 나이 : "+a.getAge()+", 학점 : "+a.getGrade());
		
		Student b = new Student("서효정",200,3.7);
		System.out.println("학생 b의 이름 : "+b.getName()+", 나이 : "+b.getAge()+", 학점 : "+b.getGrade());
		
		Student c = new Student();
		c.setName("가영이");
		c.setAge(18);
		c.setGrade(4.3);
		System.out.println("학생 c의 이름 : "+c.getName()+", 나이 : "+c.getAge()+", 학점 : "+c.getGrade());
	}
}