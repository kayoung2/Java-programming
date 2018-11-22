class Member{
	private String name;
	private int age;
	private static int number;
	
	public static int getNumber(){
		return number;
	}
	
	Member(){
		number++;
	}
	
	Member(String name,int age){
		this();
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args){
		Member lee = new Member("이가영",20);
		Member seo = new Member("서효정",27);
		Member who = new Member();
		
		System.out.println("동호회의 총 멤버는 "+Member.getNumber()+"명입니다!");
	}
}