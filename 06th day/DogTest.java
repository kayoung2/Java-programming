// ������ ���α׷��� �Ѵ� = ������ Ŭ������ �����
// ���α׷����� �ʿ��� �Ӽ��� �߷����� �� -> �߻�ȭ

class Dog{ // ������ Ŭ���� = ������ ���赵
	// �Ӽ� (���̸� �ִµ� �ʿ��� �Ӽ�) : �ʵ�, ��� ����
	// ������ : 0~10 ��������
	int full;
	
	// ���� : �޼ҵ�, ��� �Լ�
	// ��Ա�(), ���()
	void eat(int feed){ // �޼ҵ� ��� : ���ľ�(public static, ��� ����) ��ȯŸ��(void) �޼ҵ� �̸�(main) (�Ű�������(String[] args))
		// �޼ҵ� �ٵ� : �Դ� ���� ���		
		full = full+feed;
		System.out.println("��θ���!");
	}
	
	void play(){ // �޼ҵ� �ۼ�
		System.out.println("��ϱ� ��մ�!!");
		
	}
}

class DogTest{
	public static void main(String[] args){
		/*
		Dog myDog = new Dog(); // ������ ����, ���� ������ ������(�ּ�)�� ����
		int a = 4; ���� a�� ���� ������ ���� ���� ����
		*/
		
		Dog myDog;
		myDog = new Dog(); // new�� �ϴ� ���� ������ �������� �������, ������ ��ü, ������ �ν��Ͻ�
		
		Dog yourDog = new Dog(); // ������ ��ü �ϳ� �� ����
		
		yourDog.full = -100;
		System.out.println("yourDog�� ������ : "+yourDog.full);
		// ����� �����ϴ°� �Ǹ� �� �Ǵµ� �ȴ�.
		
		
		
		
		
		
		
		
		/*
		yourDog = myDog; // yourDog�� myDog�� �ȴ�. yourDog�� ������ �����⿡ ���� ���ŵȴ�.
		myDog = null; // myDog�� �� ���. �������.
		*/
		
		
		// 1. ������ �������� ���Ƿ� �ʱ�ȭ(0�̻� 10������ ����)
		myDog.full = (int) Math.random()*11;
		
		// 2. ������ ������ ���
		System.out.println("myDog�� ������ : "+myDog.full);
		
		// 3. �������� 5�̻��̸� ����ְ�, �ƴ϶�� ���̸� �ش�.
		if(myDog.full>=5) myDog.play(); // � Ŭ������ ����� �����Ϸ��� ���� ���, �޼ҵ� ȣ��
		else{
			myDog.eat(4); // 4�� ����
			System.out.println("���� �� �� myDog�� ������ : "+myDog.full);
		}
		
	}
}