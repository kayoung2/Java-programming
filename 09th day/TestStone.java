class Stone /*extends Object*/{
	int volume;
	
	Stone(){}
	Stone(int volume){
		this.volume = volume;
	}
	
	void printName(){
		System.out.println(this.getClass().getName());
	}
	
	@Override
	public String toString(){ // ��ü�� ������ ���ڿ��� ��ȯ
	// ���� toString�� public�̹Ƿ� ��ΰ� �� �� �ִµ� ������ ������ ���� ��Ű�������� �� �� ����
	// ���������ڴ� ������� ���� �� �����Ƿ� public������ ������ ������ ��, ���� ���� ����
		return "��";
	}
	
	@Override
	public boolean equals(Object obj){ // �� ��ü�� obj�� ��ġ�ϸ� true, �ƴ϶�� false
		// ������: ���ǰ� ������ ���� ���� ����
		return this.volume == ((Stone)obj).volume; // Object�� �޼ҵ�� ������ �ʵ�� ����.
	}
}

class TestStone{
	public static void main(String[] args){
		/*
		Stone dole = new Stone();
		dole.printName();
		System.out.println(dole.toString()); // Object Ŭ����(���� ����)�� toString() �޼ҵ尡 �����ϱ� ������ ȣ�Ⱑ��
		*/
		
		Stone s1 = new Stone(3);
		Stone s2 = new Stone(5);
		Stone s3 = new Stone(3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}