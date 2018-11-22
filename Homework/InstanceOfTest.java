//동물, 고양이, 강아지 클래스가 아래와 같은 상속관계가 있을때, 실행 결과를 예측하시오. 

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class InstanceOfTest{
	public static void main(String [] args){
		Cat c = new Cat();
		Animal a = new Cat();
		
		System.out.println(c instanceof Animal); //컴파일 불가? true? false? true
		System.out.println(c instanceof Cat); //컴파일 불가? true? false? true
		System.out.println(c instanceof Dog); //컴파일 불가? true? false? 불가
		
		
		System.out.println(a instanceof Animal); //컴파일 불가? true? false? true
		System.out.println(a instanceof Cat); //컴파일 불가? true? false? true
		System.out.println(a instanceof Dog); //컴파일 불가? true? false? false
		
	}
}
