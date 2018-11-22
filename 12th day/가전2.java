// 가전 제품 클래스
// 에어컨, 보일러, TV, 냉장고, 가스렌지, 세탁기
// 생성자: 가격을 매개변수로 받아 필드 가격을 그 값으로 초기화하는 생성자
// toString()메소드 재정의: 나는 **가격의 ***입니다: 예시) 나는 100만원의 에어컨입니다.
import java.util.Arrays;

class 가전2 implements Comparable{
	// Comparable 인터페이스를 구현하면(상속하면) 비교 가능한 클래스가 됨
	int price;
	
	public int compareTo(Object o){ // 비교하는 메소드
		// 이 객체의 가격과 매개변수의 가격을 비교해서 이 객체의 가격이 높으면 1, 낮으면 -1, 같으면 0을 반환하도록 작성
		
		if(o instanceof 가전2){
			if(((가전2)o).price<this.price) return 1;
			else if(((가전2)o).price==this.price) return 0;
			else return -1;
		}
		else return -100; // o가 가전이 아닌 경우
	}
	
	가전2(int price){
		this.price = price;
	}
	
	void on(){ // **가 켜집니다.
		System.out.println(this.getClass().getName()+"이(가) 켜집니다.");
	}
	
	void off(){ // **가 꺼집니다.
		System.out.println(this.getClass().getName()+"이(가) 꺼집니다.");
	}
	
	public String toString(){
		return String.format("%d만원의 %s입니다.",price,this.getClass().getName());
	}
}

class 에어컨 extends 가전2{
	에어컨(int price){
		super(price);
	}
}
class 보일러 extends 가전2{
	보일러(int price){
		super(price);
	}
}
class 가스렌지 extends 가전2{
	가스렌지(int price){
		super(price);
	}
}
class TV extends 가전2{
	TV(int price){
		super(price);
	}
}
class 냉장고 extends 가전2{
	냉장고(int price){
		super(price);
	}
}
class 세탁기 extends 가전2{
	세탁기(int price){
		super(price);
	}
}

class 가전테스트2{
	public static void main(String[] args){
		가전2 [] 내가전들 = {new 에어컨(127), new 보일러(22), new 가스렌지(6), new TV(72), new 냉장고(138), new 세탁기(37)};
		
		for(가전2 x: 내가전들) System.out.println(x.toString());
		
		int a =내가전들[4].compareTo(내가전들[0]);
		
		if(a==-1) System.out.println("에어컨 승! 더 비쌈.");
		else if(a==0) System.out.println("무승부! 가격 동일.");
		else System.out.println("냉장고 승! 더 비쌈.");
		
		// Arrays.sort(배열); // 반드시 Comparable을 구현한 클래스의 배열
		Arrays.sort(내가전들); // 가격에 따라서 오름차순으로 정렬
		
		for(가전2 x: 내가전들) System.out.println(x.toString());
	}
}