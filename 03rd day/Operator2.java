import java.util.Scanner;

class Operator2{
	public static void main(String [] args){
		int a=7, b=-1, max;
		
		max = a>b?a:b;
		System.out.println("�ִ� : "+max);
		
		/*
		����ڿ��� �Ǽ��� ����, Ÿ��(������, ���ڿ�: A/B)�� �Է¹ް�,
		Ÿ���� A���̰�, 70�� �̻��� ��� �հ��� ����ϰ�,
		�ƴ϶�� ���հ��� ����ϴ� ���α׷��� ���� �����ڸ� ����Ͽ� �ۼ�
		*/
		
		Scanner scan = new Scanner(System.in);
		int grade;
		char type;
		
		System.out.print("����: ");
		grade = scan.nextInt();
		
		System.out.print("Ÿ�� (A/B): ");
		type = scan.next().charAt(0); // ù��°(0��°) ���� �Է¹���
		
		int result = grade>=70 ? 1 :0;
		
		if(type=='A' && result==1)
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ� �Դϴ�.");
		
		
		
		// �������� �Ͻ� ���
		int grade2;
		char type2;
		// String type2;
		String pass;
		
		System.out.print("����: ");
		grade2 = scan.nextInt();
		
		System.out.print("Ÿ�� (A/B): ");
		type2 = scan.next().charAt(0);
		// type2 = scan.next();
		
		pass = grade2>=70 && (type2=='A' || type2=='a')? "�հ�" : "���հ�";
		// pass = grade2>=70 && type2=="A" ? "�հ�" : "���հ�";
		
		/* �հ��� �־�� �ϴµ� ���հ��� ������ ������ ���� �ڷ����� ==���� �� ����
		But, ���ڿ����� ���� �ڷ����� �ƴ� ��쿡�� ==���� �񱳰� �Ұ��� �ϴ�.
		
		pass = grade2>=70 && type2.equals("A") ? "�հ�" : "���հ�";
		equals() �޼ҵ带 ����ؼ� ���ڿ� �� ���� */
		
		System.out.println(pass);
	}
}