class Student{
	void report(Subject sub){
		System.out.println(sub.getClass().getName()+" ���� ����: "+sub.getGrade());
		// grade�� private�ʵ��̹Ƿ� getGrade()�� �̿��ؾ� �Ѵ�.
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

class ���� extends Subject{
	����(){} // super(); ��������, ������ ����Ʈ �����ڸ� ȣ����
	
	����(int grade){
		super(grade);
	}
}
class ���� extends Subject{
	����(){}
	
	����(int grade){
		super(grade);
	}
}
class ���� extends Subject{
	����(){}
	
	����(int grade){
		super(grade);
	}
}
class ���� extends Subject{
	����(){}
	
	����(int grade){
		super(grade);
	}
}

class Test_2{
	public static void main(String[] args){
		Subject[] sub = {new ����(100), new ����(), new ����(), new ����(100)};
		// ����� ����! ���� Ŭ������ �ϳ��� �迭���� �׷�ȭ!
		
		Student lee = new Student();
		
		for(Subject s: sub) lee.report(s);
	}
}