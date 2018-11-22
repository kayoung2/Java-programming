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
		  // nextInt, nextDouble, next는 비슷하고 nextLine은 좀 다르다. nextLine은 메모리에 있는 엔터까지 들고 감!
		  // 버퍼를 비우는 것은 비슷한 세 종류 다음에 nextLine을 쓸 때만 사용
		
	  	System.out.print("이름 : ");
		
		  name = myScanner.nextLine(); // myScanner가 한 줄 읽어온 것을 name에다 저장해라.
		  // nextLine이 앞의 엔터를 입력으로 받아들이는 오류를 고치기 위해 next로 사용, 대신 띄어쓰기를 하면 안 됨.
		
		
		
		  System.out.println("나이 : "+age);
    	// System.out.println("이름은 "+name+"입니다.");
		  System.out.printf("당신의 키는 %.1f입니다.\n", height); // f는 formatted로 f를 붙이면 서식지정자 사용 가능
		  // 정수 %d, 문자 %c, 문자열 %s, 실수 %f 
		  System.out.printf("이름은 %s입니다.\n", name);
		
		  System.out.println("JRE : 자바 실행 환경");
		  System.out.println("JDK : 자바 개발 환경");
	  }
    }

##### 1. class Scanner의 메소드 (=c언어의 함수)
##### 2. 버퍼 - 정수 int 실수 double 글자 char 문자열 String(기초 자료형이 아니기 때문에 대문자 S)

#

### 02nd day

##### 1byte->8bit
##### unsigned byte 0~255 (2의 8승개, 256개 저장)
##### byte -128~127

+ 정수 int 4byte, short 2byte, byte 1byte, long 8byte
+ 실수 double 8byte, float 4byte
+ 문자 char 

##### 0.1=>0.0001.....(2진법)(무한소수 형태로 나타남)

+ 변수의 3요소 
  + 값
  + 자료형(자료 타입)
  + 변수명(변수의 이름)

##### C에서는 0을 제외하고 모두 참
##### java에서는 true/false로 참 거짓을 표현

#

##### C에서 무한 반복
    while(1){}

##### java에서 무한 반복
    while(true){}

#

    Scanner myScanner = new Scanner(System.in);
    
##### 스캐너 형의 myScanner라는 변수
##### myScanner라는 공간이 생기고 그 주소만 저장됨
##### 참조형 자료형! 기초형과 다르다.

    int age;
    자료형 변수명; = 변수 선언
##### 값을 처음으로 주는 것 = 초기화

    int age, double number; (x)
##### 같은 타입은 한 줄에 선언할 수 있지만
##### 다른 타입은 불가능 하다.

##### 자바에서 함수는 메쏘드

+ 식별자
  + 변수명, method이름, class이름
  + 대소문자 알파벳, 숫자, 밑줄(_ ), 달러($) 기호로 구성
  + 키워드는 사용할 수 없다. (키워드=예약어)
  + 첫 문자로 숫자가 나올 수 없다. ex) 77kenterky, 88restaurant (x)
  + 대소문자를 구별한다.
  + COUNT, count, Count (모두 다른 변수명)
  + 한글 이용 가능하나 권장하지 않는다.

##### class 이름의 첫글자는 대문자 (Scanner, String은 class라는 것을 알 수 있음)
##### 변수, 메서드 이름은 소문자로 시작하는데 2번째 단어의 첫글자는 대문자로 한다.
##### 상수는 모든 문자를 대문자로 한다.

    const double PI = 3.14; (C)
##### pi를 상수화 시킨다. 더이상 변하지 못 하게 한다.

    final double PI = 3.14; (java)
##### 변하게 하려고 할 경우 compile error

+ 8진수 표현 014 (0을 붙여줌)
+ 16진수 표현 0x14 (0x를 붙여줌)
+ 2진수 표현 0b101 (0b를 붙여줌)

##### 보통 큰 숫자를 구분하기 위해 1000단위로 ,를 찍는데
##### 프로그램 언어에서는 그럴 수 없으니 _ 를 이용한다.

##### 365l 또는 365L을 적어 줄 경우 365를 long타입으로 인식

    dist_f = (double) distance; // long 타입 -> double 타입
    (변환하고싶은 타입)(자료형) 형변환 연산자 casting

##### double형을 byte타입으로 바꿀 경우 손실이 발생함 (버림)
##### -> 형변환 연산자 사용 필수

    %e 2.56e4는 25600
    %E 2.56E4도 25600

##### java에서 참은 true 거짓은 false 뿐이다.

##### nextByte,Short,Int,Long,Float,Double 다 있지만 nextChar는 없기 때문에 next().charAt()을 사용한다.

+ 자바 프로그램의 개발 단위는 class 단위이다.
+ 주석은 프로그램에 대한 설명이다.
+ 입력을 받아서 작업을 수행하고 결과를 내보내는 작은 기계로 생각할 수 있는 것은 메소드(함수)이다.
+ 모든 자바 소스 파일의 확장자는 .java이다.
+ 프로그램에서 데이터를 저장하는 공간은 변수이고 변수에 값을 저장하는 연산을 대입이라고 한다.
+ 실행 도중에 값이 변하지 않는 수를 상수라고 한다.
+ 사용자로부터 값을 입력받으려면 Scanner 클래스를 사용하는 것이 편리하다.

+ 변수가 -3000에서 +3000까지의 값을 저장하여야 한다면 short 자료형이 최적이다.
+ 28.9가 28.9F보다 더 많은 메모리 공간을 차지한다.
+ boolean 자료형이 가질 수 있는 값은 true또는 false이다.
+ 변수에 새로운 값이 대입되면 기존의 값은 버려진다.
+ days와 Days는 다른 변수이다.
+ 8itmes와 #ofPlayer는 바르지 않은 변수명이다.

#

+ 연산자

  + 단항 연산자 : (char)a, ++i, i++, --i, i--, +i, -i
  + casting연산자(형변환)-byte,short,int,long
  + 이항 연산자 : +, -, /, %
  
        5%2=1, 5.3%2=1.3, 5/2=2, 50/2=25, 5/2.0=2.5
	
##### 5/9*(화씨-32)에서 5/9는 정수로 취급해서 0이기 때문에 결과값이 계속 0으로 나온다.
##### 이를 맞게 계산하기 위해서는 (double)5/9*(화-32)로 하는 방법과 5.0/9.0*(화-32)가 있다.
##### 6/0은 예외가 발생하는데 6.0/0처럼 실수를 나누면 무한대이다.
##### 0/0도 예외인데 0/0.0은 NaN(Not a Number)가 나온다.

+ 삼항 연산자
  + 조건 ? 참이면 실행 : 거짓이면 실행

#

### 03rd day

+ +의 의미
  + 덧셈
  + 연결 (S.o.p("효정이 키는"+height+"이다.");)(문자열 뒤)
  
  
+ 관계(비교)
  + =, <, ((((((==, !=))))))중요
  
+ AND OR XOR NOT
  +논리 연산자 && ||  ^   ! (피연산자 논리형)
  +비트 연산자 &  |   ^   ~ (피연산자 정수형)

##### 3&&4->C에서는 가능(0아니면 true), true&&true해서 true가 됨
##### 자바에서는 불가능, 논리 연산자이므로 논리형이 와야 한다.

    3&7 = 00000011 & 00000111 = 00000011 = 3 // 둘 다 1이면 1
    3|7 = 00000011 | 00000111 = 00000111 = 7 // 둘 중 하나라도 1이면 1
    3^7 = 00000011 ^ 00000111 = 00000100 = 4 // 같으면 0 다르면 1
    ~7 = ~00000111 = 11111000 = -8 // 0은 1로 1은 0으로

##### >> 옆으로 당긴다 <<
    4>>1 = 2 (100>>010) // 오른쪽으로 1칸 shift
    4>>2 = 1 (100>>001)
    
##### >>n 오른쪽으로 n칸 shift : /2^n
    4<<1 = 8 (0100<<1000)

##### <<n 왼쪽으로 n칸 shift : * 2^n
    17<<<3을 하면 byte타입으로 표현할 수 있는 수보다 큰 수가 나와서 overflow, 음수가 나온다.
    7>>1 = 3 (이 때 나누기는 정수형 나누기로 3.5가 나오지 않음)(111>>011.1(3으로 간주))

#

### 05th day

![test 4](https://user-images.githubusercontent.com/45006693/48917901-89f3de80-eecc-11e8-8260-e1e7dd884d53.PNG)

#

###
