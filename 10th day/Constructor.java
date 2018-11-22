// 첼로리스트, 피아니스트, 바이올리니스트 클래스 만들기
// 각각의 클래스는 연주하는 메소드를 가짐: "**를 연주합니다."를 출력
// 상속(연주자 클래스를 상속)을 사용하여 구현

// 연주자들에게 지휘할 수 있는 지휘자 클래스 만들어서 연주하기!
// 연주자를 매개변수로 받아 지휘하는 메소드

class Musician{
	void play(){
		System.out.println("연주합니다.");
	}
}

class Cellist extends Musician{
	@Override
	void play(){
		System.out.print("첼로를 ");
		super.play();
	}
}

class Pianist extends Musician{
	@Override
	void play(){
		System.out.print("피아노를 ");
		super.play();
	}
}

class Violinist extends Musician{
	@Override
	void play(){
		System.out.print("바이올린을 ");
		super.play();
	}
}

class Constructor{
	public static void main(String[] args){
		/*
		Cellist c1 = new Cellist();
		Cellist c2 = new Cellist();
		Pianist p1 = new Pianist();
		
		c1.play();
		c2.play();
		p1.play();
		*/
		
		Cellist c1 = new Cellist();
		Musician c2 = new Cellist();
		// 한 객체가 여러 이름으로 불릴 수 있음 -> 다형성
		
		/*
		Cellist[] c = {new Cellist(), new Cellist(), new Cellist()};
		Pianist[] p = {new Pianist(), new Pianist(), new Pianist()};
		Violinist[] v = {new Violinist(), new Violinist(), new Violinist()};
		
		for(Cellist cellist: c){
			cellist.play();
		}
		
		for(Pianist pianist: p){
			pianist.play();
		}
		
		for(Violinist violinist: v){
			violinist.play();
		}
		*/
		
		Musician[] musicians = {new Cellist(), new Cellist(), new Cellist(), new Pianist(), new Pianist(), new Pianist(), new Violinist(), new Violinist()};
		
		for(int i=0;i<musicians.length;i++){
			musicians[i].play();
		}
	}
}