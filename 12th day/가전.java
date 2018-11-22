// 가전 제품 클래스
// 에어컨, 보일러, TV, 냉장고, 가스렌지, 세탁기

abstract class 가전{
	void on(){ // **가 켜집니다.
		System.out.println(this.getClass().getName()+"이(가) 켜집니다.");
	}
	
	void off(){ // **가 꺼집니다.
		System.out.println(this.getClass().getName()+"이(가) 꺼집니다.");
	}
}

// 에어컨, 보일러, 가스렌지: 온도 조절하는 기능을 가진 메소드 존재
// 정수를 매개변수로 받아 그 온도로 조절하는 메소드

/*
class 에어컨 extends 가전{
	void adjust(int a){
	System.out.println(a+"ºC로 온도 조절됩니다.");
	}
}
class 보일러 extends 가전{
	void adjust(int a){
	System.out.println(a+"ºC로 온도 조절됩니다.");
	}
}
*/

class 에어컨 extends 가전 implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"ºC로 온도 조절됩니다.");
	}
}
class 보일러 extends 가전 implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"ºC로 온도 조절됩니다.");
	}
}
class 가스렌지 extends 가전 implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"ºC로 온도 조절됩니다.");
	}
}
class TV extends 가전{}
class 냉장고 extends 가전{}
class 세탁기 extends 가전{}

interface Adjustable{
	// abstract public void adjust(int a);
	void adjust(int a); // abstract 생략 가능
}

class 가전테스트{
	public static void main(String[] args){
		가전[] 내가전들 = {new 냉장고(), new 에어컨(), new 보일러(), new 가스렌지(), new TV(), new 세탁기()};
		
		for(가전 x: 내가전들){
			x.on();
			x.off();
		}
		
		Adjustable[] 온도조절가전들 = {new 에어컨(), new 보일러(), new 가스렌지()};
		
		for(Adjustable y: 온도조절가전들) y.adjust(100);
		
		/*
		((에어컨)내가전들[1]).adjust(100);
		((보일러)내가전들[2]).adjust(100);
		((가스렌지)내가전들[3]).adjust(100);
		// 내가전들은 가전들의 배열인데 가전에는 adjust가 없기때문에 casting해야한다.
		*/
	}
}