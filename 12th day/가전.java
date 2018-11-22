// ���� ��ǰ Ŭ����
// ������, ���Ϸ�, TV, �����, ��������, ��Ź��

abstract class ����{
	void on(){ // **�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	
	void off(){ // **�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
}

// ������, ���Ϸ�, ��������: �µ� �����ϴ� ����� ���� �޼ҵ� ����
// ������ �Ű������� �޾� �� �µ��� �����ϴ� �޼ҵ�

/*
class ������ extends ����{
	void adjust(int a){
	System.out.println(a+"��C�� �µ� �����˴ϴ�.");
	}
}
class ���Ϸ� extends ����{
	void adjust(int a){
	System.out.println(a+"��C�� �µ� �����˴ϴ�.");
	}
}
*/

class ������ extends ���� implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"��C�� �µ� �����˴ϴ�.");
	}
}
class ���Ϸ� extends ���� implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"��C�� �µ� �����˴ϴ�.");
	}
}
class �������� extends ���� implements Adjustable{
	public void adjust(int a){
	System.out.println(a+"��C�� �µ� �����˴ϴ�.");
	}
}
class TV extends ����{}
class ����� extends ����{}
class ��Ź�� extends ����{}

interface Adjustable{
	// abstract public void adjust(int a);
	void adjust(int a); // abstract ���� ����
}

class �����׽�Ʈ{
	public static void main(String[] args){
		����[] �������� = {new �����(), new ������(), new ���Ϸ�(), new ��������(), new TV(), new ��Ź��()};
		
		for(���� x: ��������){
			x.on();
			x.off();
		}
		
		Adjustable[] �µ����������� = {new ������(), new ���Ϸ�(), new ��������()};
		
		for(Adjustable y: �µ�����������) y.adjust(100);
		
		/*
		((������)��������[1]).adjust(100);
		((���Ϸ�)��������[2]).adjust(100);
		((��������)��������[3]).adjust(100);
		// ���������� �������� �迭�ε� �������� adjust�� ���⶧���� casting�ؾ��Ѵ�.
		*/
	}
}