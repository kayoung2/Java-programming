//����, �����, ������ Ŭ������ �Ʒ��� ���� ��Ӱ��谡 ������, ���� ����� �����Ͻÿ�. 

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class InstanceOfTest{
	public static void main(String [] args){
		Cat c = new Cat();
		Animal a = new Cat();
		
		System.out.println(c instanceof Animal); //������ �Ұ�? true? false? true
		System.out.println(c instanceof Cat); //������ �Ұ�? true? false? true
		System.out.println(c instanceof Dog); //������ �Ұ�? true? false? �Ұ�
		
		
		System.out.println(a instanceof Animal); //������ �Ұ�? true? false? true
		System.out.println(a instanceof Cat); //������ �Ұ�? true? false? true
		System.out.println(a instanceof Dog); //������ �Ұ�? true? false? false
		
	}
}
