class Fruit{
	void print(){
		System.out.println("나는 "+this.getClass().getName());
		// 굳이 매개변수를 자기 자신으로 넣을 필요가 없음
	}
}

class 포도 extends Fruit{}
class 사과 extends Fruit{}
class 배 extends Fruit{}

class Introduce{
	public static void main(String[] args){
		Fruit[] f = {new 포도(),  new 사과(), new 배()};
		
		for(Fruit fr:f) fr.print();
	}
}