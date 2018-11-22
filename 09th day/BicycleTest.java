// ������ Ŭ����
// �ʵ�: ������
// ������: �������� �Ű������� �޾� �ʵ� �������� �ʱ�ȭ
// Object Ŭ������ toString() �޼ҵ� ������: ������ ������ ��ȯ�ϵ��� ������
// Object Ŭ������ equals() �޼ҵ� ������: �������� ������ ���� �����ŷ� �ν��ϵ���������

// �ι������� 2��, �׹������� 1�� �����ؼ� toString(), equals() �޼ҵ� �׽�Ʈ

class Bicycle{
	int tire;
	
	Bicycle(int tire){
		this.tire = tire;
	}
	
	@Override
	public String toString(){
		return "���� ��: "+tire+"��";
	}
	
	@Override
	public boolean equals(Object obj){
		return this.tire == ((Bicycle)obj).tire;
	}
}

class BicycleTest{
	public static void main(String[] args){
		Bicycle b1 = new Bicycle(2);
		Bicycle b2 = new Bicycle(2);
		Bicycle b3 = new Bicycle(4);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}
}