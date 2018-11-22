class Student{
	void report(Subject sub){
		System.out.println(sub.getClass().getName()+" 과목 점수: "+sub.getGrade());
		// grade는 private필드이므로 getGrade()를 이용해야 한다.
	}
}

class Subject{
	private int grade;
	
	Subject(){
		this.grade = (int)(Math.random()*101);
	}
	
	Subject(int grade){
		this.grade = grade;
	}
	
	int getGrade(){
		return grade;
	}
}

class 국어 extends Subject{
	국어(){} // super(); 생략가능, 어차피 디폴트 생성자를 호출함
	
	국어(int grade){
		super(grade);
	}
}
class 영어 extends Subject{
	영어(){}
	
	영어(int grade){
		super(grade);
	}
}
class 수학 extends Subject{
	수학(){}
	
	수학(int grade){
		super(grade);
	}
}
class 과학 extends Subject{
	과학(){}
	
	과학(int grade){
		super(grade);
	}
}

class Test_2{
	public static void main(String[] args){
		Subject[] sub = {new 국어(100), new 영어(), new 수학(), new 과학(100)};
		// 상속의 장점! 여러 클래스를 하나의 배열으로 그룹화!
		
		Student lee = new Student();
		
		for(Subject s: sub) lee.report(s);
	}
}