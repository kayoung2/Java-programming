// 3��° ������ 13���� ����

class Kkang{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5};
		change(arr[2]);
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr[2]);
	}
	
	// 3��° ������ 13���� �����ϴ� �޼ҵ� 1
	static void change(int a){ // a=3
		a=13; // a=13, �迭�� ������ �������� ����
	}
	
	// 3��° ������ 13���� �����ϴ� �޼ҵ� 2
	static void change(int[] a){ // �Ű������� �ٸ��� ������ �̸� ���Ƶ� ����, �ߺ�����
		a[2]=13;
	}
}