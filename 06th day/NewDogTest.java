class NewDog{
	private int full; // full�̶�� �ʵ忡 �ܺο��� �Ժη� ������ �� ����.
	private int size;
	
	// size�� �ܺο��� ������ �� �ִ� setter�� �ۼ�
	// setter : �ʵ尪�� �����ϴ� �޼ҵ�, setXXXX ��, setSize, setFull,...
	
	void setSize(int s){ // �������� ũ�⸦ �����ϴ� �޼ҵ�
		if(s>100 || s<1) size = 5; // ��ȿ���� �ƴ� ��� ó�� ��ƾ
		else size = s;
	}
	// getter : �ܺο��� �����̺��� �ʵ尪�� ��� ���� �ۼ��ϴ� �޼ҵ�
	// getXXX, ��, getSize, getFull,...
	
	int getSize(){ // ��ȯŸ�� �Լ��̸�(�Ű�����){}
		return size; // return �޼ҵ��� �����(��ȯ��);
	}
	
	void eat(int feed){	
		full = full+feed;
		System.out.println("��θ���!");
	}
	
	void play(){
		System.out.println("��ϱ� ��մ�!!");
	}
}

class NewDogTest{
	public static void main(String[] args){
		NewDog myDog = new NewDog();
		// myDog.size = 10; // �� ������ ������� ����, private�̱� ������!
		myDog.setSize(-1000000);
		
		
		System.out.println("myDog�� ũ�� : "+myDog.getSize()); // getSize�� �Լ��⶧���� �ݵ�� ��ȣ! �Է¹޴� �� �����Ƿ� ()
	}
		
}