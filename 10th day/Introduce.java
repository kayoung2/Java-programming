class Fruit{
	void print(){
		System.out.println("���� "+this.getClass().getName());
		// ���� �Ű������� �ڱ� �ڽ����� ���� �ʿ䰡 ����
	}
}

class ���� extends Fruit{}
class ��� extends Fruit{}
class �� extends Fruit{}

class Introduce{
	public static void main(String[] args){
		Fruit[] f = {new ����(),  new ���(), new ��()};
		
		for(Fruit fr:f) fr.print();
	}
}