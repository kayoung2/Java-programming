// ���� ��ǰ Ŭ����
// ������, ���Ϸ�, TV, �����, ��������, ��Ź��
// ������: ������ �Ű������� �޾� �ʵ� ������ �� ������ �ʱ�ȭ�ϴ� ������
// toString()�޼ҵ� ������: ���� **������ ***�Դϴ�: ����) ���� 100������ �������Դϴ�.
import java.util.Arrays;

class ����2 implements Comparable{
	// Comparable �������̽��� �����ϸ�(����ϸ�) �� ������ Ŭ������ ��
	int price;
	
	public int compareTo(Object o){ // ���ϴ� �޼ҵ�
		// �� ��ü�� ���ݰ� �Ű������� ������ ���ؼ� �� ��ü�� ������ ������ 1, ������ -1, ������ 0�� ��ȯ�ϵ��� �ۼ�
		
		if(o instanceof ����2){
			if(((����2)o).price<this.price) return 1;
			else if(((����2)o).price==this.price) return 0;
			else return -1;
		}
		else return -100; // o�� ������ �ƴ� ���
	}
	
	����2(int price){
		this.price = price;
	}
	
	void on(){ // **�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	
	void off(){ // **�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	
	public String toString(){
		return String.format("%d������ %s�Դϴ�.",price,this.getClass().getName());
	}
}

class ������ extends ����2{
	������(int price){
		super(price);
	}
}
class ���Ϸ� extends ����2{
	���Ϸ�(int price){
		super(price);
	}
}
class �������� extends ����2{
	��������(int price){
		super(price);
	}
}
class TV extends ����2{
	TV(int price){
		super(price);
	}
}
class ����� extends ����2{
	�����(int price){
		super(price);
	}
}
class ��Ź�� extends ����2{
	��Ź��(int price){
		super(price);
	}
}

class �����׽�Ʈ2{
	public static void main(String[] args){
		����2 [] �������� = {new ������(127), new ���Ϸ�(22), new ��������(6), new TV(72), new �����(138), new ��Ź��(37)};
		
		for(����2 x: ��������) System.out.println(x.toString());
		
		int a =��������[4].compareTo(��������[0]);
		
		if(a==-1) System.out.println("������ ��! �� ���.");
		else if(a==0) System.out.println("���º�! ���� ����.");
		else System.out.println("����� ��! �� ���.");
		
		// Arrays.sort(�迭); // �ݵ�� Comparable�� ������ Ŭ������ �迭
		Arrays.sort(��������); // ���ݿ� ���� ������������ ����
		
		for(����2 x: ��������) System.out.println(x.toString());
	}
}