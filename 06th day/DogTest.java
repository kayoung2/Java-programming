// 강아지 프로그래밍 한다 = 강아지 클래스를 만든다
// 프로그램에서 필요한 속성만 추려내는 것 -> 추상화

class Dog{ // 강아지 클래스 = 강아지 설계도
	// 속성 (먹이를 주는데 필요한 속성) : 필드, 멤버 변수
	// 포만감 : 0~10 정수형태
	int full;
	
	// 동작 : 메소드, 멤버 함수
	// 밥먹기(), 놀기()
	void eat(int feed){ // 메소드 헤드 : 수식어(public static, 없어도 ㄱㅊ) 반환타입(void) 메소드 이름(main) (매개변수들(String[] args))
		// 메소드 바디 : 먹는 동작 기술		
		full = full+feed;
		System.out.println("배부르다!");
	}
	
	void play(){ // 메소드 작성
		System.out.println("노니까 재밌다!!");
		
	}
}

class DogTest{
	public static void main(String[] args){
		/*
		Dog myDog = new Dog(); // 강아지 생성, 참조 변수로 참조값(주소)이 저장
		int a = 4; 에서 a는 기초 변수로 실제 값이 저장
		*/
		
		Dog myDog;
		myDog = new Dog(); // new를 하는 순간 실제로 강아지가 만들어짐, 강아지 객체, 강아지 인스턴스
		
		Dog yourDog = new Dog(); // 강아지 객체 하나 더 생성
		
		yourDog.full = -100;
		System.out.println("yourDog의 포만감 : "+yourDog.full);
		// 맘대로 조정하는게 되면 안 되는데 된다.
		
		
		
		
		
		
		
		
		/*
		yourDog = myDog; // yourDog가 myDog가 된다. yourDog는 쓰레기 수집기에 의해 수거된다.
		myDog = null; // myDog는 다 썼다. 쓸모없다.
		*/
		
		
		// 1. 강아지 포만감을 임의로 초기화(0이상 10이하의 정수)
		myDog.full = (int) Math.random()*11;
		
		// 2. 강아지 포만감 출력
		System.out.println("myDog의 포만감 : "+myDog.full);
		
		// 3. 포만감이 5이상이면 놀아주고, 아니라면 먹이를 준다.
		if(myDog.full>=5) myDog.play(); // 어떤 클래스의 멤버에 접근하려면 점을 사용, 메소드 호출
		else{
			myDog.eat(4); // 4는 인자
			System.out.println("먹이 준 후 myDog의 포만감 : "+myDog.full);
		}
		
	}
}