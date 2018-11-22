class NewDog{
	private int full; // full이라는 필드에 외부에서 함부로 접근할 수 없다.
	private int size;
	
	// size를 외부에서 설정할 수 있는 setter를 작성
	// setter : 필드값을 설정하는 메소드, setXXXX 예, setSize, setFull,...
	
	void setSize(int s){ // 강아지의 크기를 설정하는 메소드
		if(s>100 || s<1) size = 5; // 유효값이 아닌 경우 처리 루틴
		else size = s;
	}
	// getter : 외부에서 프라이빗한 필드값을 얻기 위해 작성하는 메소드
	// getXXX, 예, getSize, getFull,...
	
	int getSize(){ // 반환타입 함수이름(매개변수){}
		return size; // return 메소드의 결과값(반환값);
	}
	
	void eat(int feed){	
		full = full+feed;
		System.out.println("배부르다!");
	}
	
	void play(){
		System.out.println("노니까 재밌다!!");
	}
}

class NewDogTest{
	public static void main(String[] args){
		NewDog myDog = new NewDog();
		// myDog.size = 10; // 이 문장을 실행되지 않음, private이기 때문에!
		myDog.setSize(-1000000);
		
		
		System.out.println("myDog의 크기 : "+myDog.getSize()); // getSize는 함수기때문에 반드시 괄호! 입력받는 것 없으므로 ()
	}
		
}