class Student{
	private String name;
	private int age;
	private double grade;
	
	Student(){
		this("���޷�",5,4.21);
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
		
		System.out.println("�л� a�� �̸� : "+a.getName()+", ���� : "+a.getAge()+", ���� : "+a.getGrade());
		
		Student b = new Student("��ȿ��",200,3.7);
		System.out.println("�л� b�� �̸� : "+b.getName()+", ���� : "+b.getAge()+", ���� : "+b.getGrade());
		
		Student c = new Student();
		c.setName("������");
		c.setAge(18);
		c.setGrade(4.3);
		System.out.println("�л� c�� �̸� : "+c.getName()+", ���� : "+c.getAge()+", ���� : "+c.getGrade());
	}
}