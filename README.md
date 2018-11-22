# Java-programming

### 2018학년도 1학기에 들었던 자바프로그래밍 강의 내용입니다.
***

### 01st day

    import java.util.Scanner; // #include와 비슷 Scanner class를 불러주는 것
    
##### java.util.Scanner를 구글에 검색하면 Scanner에 대한 설명이 있다.

    class Lee{ // public class도 가능하고 class도 가능함, class 이름은 대문자로 시작
	  public static void main(String [] args){ // pubilc 꼭 적어야 함
	  //String args [] 해도 상관 없으나 중간에 할 것, []는 배열을 의미
		
		  int age; // 나이 저장할 메모리 공간 확보 : 변수 선언
		  String name; // 문자열을 입력 받을 때는 String형 변수 선언
		  double height; // 실수를 저장할 공간 확보 : 실수형 변수 선언
		
		
		  Scanner myScanner = new Scanner(System.in); // System.in = 표준 입력 장치 : 키보드
		  // 관례상 두 개의 단어를 붙여쓸 경우 두 번째 단어는 대문자로 시작
		  // 변수명, 클래스명이 두 단어 이상의 합성어일 경우 두 번째 단어의 첫 문자는 대문자로!
		  System.out.print("나이 : ");
		  // print는 줄바꿈을 안 하고 그냥 출력하고 println은 줄바꿈을 하고 출력한다.
		  // c에서와 똑같이 \n은 줄바꿈 문자
		
		  age = myScanner.nextInt(); // 만들어 놓은 Scanner에게 다음 int를 입력받으라는 뜻
		  // 아까 만든 스캐너에게 정수 하나를 입력 받으라고 하고, 그걸 age에 저장!
		
		  myScanner.nextLine();
		
		  System.out.print("키? ");
		  height = myScanner.nextDouble();
		
	  	myScanner.nextLine(); // 버퍼를 비우는 용도, next말고 nextLine을 사용하기 위해서
		  // nextInt, nextDouble, next는 비슷하고 nextLine은 좀 다르다. nextLine은 메모리에 있는 엔터까지 들고 가버린다!
		  // 버퍼를 비우는 것은 비슷한 세 종류 다음에 nextLine을 쓸 때만 사용
		
	  	System.out.print("이름 : ");
		
		  name = myScanner.nextLine(); // myScanner가 한 줄 읽어온 것을 name에다 저장해라.
		  // nextLine이라고 하면 앞의 엔터를 입력으로 받아들이는 오류를 고치기 위해 next로 사용, 대신 띄어쓰기를 하면 안 됨. 이 가영->이
		
		
		
		  System.out.println("나이 : "+age);
    	// System.out.println("이름은 "+name+"입니다.");
		  System.out.printf("당신의 키는 %.1f입니다.\n", height); // f는 formatted로 f를 붙이면 서식지정자 사용 가능하다.
		  // 정수 %d, 문자 %c, 문자열 %s, 실수 %f 
		  System.out.printf("이름은 %s입니다.\n", name);
		
		  System.out.println("JRE : 자바 실행 환경");
		  System.out.println("JDK : 자바 개발 환경");
	  }
    }

##### 1. class Scanner의 메소드 (=c언어의 함수)
##### 2. 버퍼 - 정수 int 실수 double 글자 char 문자열 String(기초 자료형이 아니기 때문에 대문자 S)
