import java.util.Scanner; // #include�� ��� Scanner class�� �ҷ��ִ� ��
// java.util.Scanner�� ���ۿ� �˻��ϸ� Scanner�� ���� ������ �ִ�.

class Lee{ // public class�� �����ϰ� class�� ������, class �̸��� �빮�ڷ� ����
	public static void main(String [] args){ // pubilc �� ����� ��
	//String args [] �ص� ��� ������ �߰��� �� ��, []�� �迭�� �ǹ�
		
		int age; // ���� ������ �޸� ���� Ȯ�� : ���� ����
		String name; // ���ڿ��� �Է� ���� ���� String�� ���� ����
		double height; // �Ǽ��� ������ ���� Ȯ�� : �Ǽ��� ���� ����
		
		
		Scanner myScanner = new Scanner(System.in); // System.in = ǥ�� �Է� ��ġ : Ű����
		// ���ʻ� �� ���� �ܾ �ٿ��� ��� �� ��° �ܾ�� �빮�ڷ� ����
		// ������, Ŭ�������� �� �ܾ� �̻��� �ռ����� ��� �� ��° �ܾ��� ù ���ڴ� �빮�ڷ�!
		System.out.print("���� : ");
		// print�� �ٹٲ��� �� �ϰ� �׳� ����ϰ� println�� �ٹٲ��� �ϰ� ����Ѵ�.
		// c������ �Ȱ��� \n�� �ٹٲ� ����
		
		age = myScanner.nextInt(); // ����� ���� Scanner���� ���� int�� �Է¹������ ��
		// �Ʊ� ���� ��ĳ�ʿ��� ���� �ϳ��� �Է� ������� �ϰ�, �װ� age�� ����!
		
		
		System.out.print("Ű? ");
		height = myScanner.nextDouble();
		
		
		
		myScanner.nextLine(); // ���۸� ���� �뵵, next���� nextLine�� ����ϱ� ���ؼ�
		// nextInt, nextDouble, next�� ����ϰ� nextLine�� �� �ٸ���. nextLine�� �޸𸮿� �ִ� ���ͱ��� ��� ��������!
		// ���۸� ���� ���� ����� �� ���� ������ nextLine�� �� ���� ���
		
		System.out.print("�̸� : ");
		
		name = myScanner.nextLine(); // myScanner�� �� �� �о�� ���� name���� �����ض�.
		// nextLine�̶�� �ϸ� ���� ���͸� �Է����� �޾Ƶ��̴� ������ ��ġ�� ���� next�� ���, ��� ���⸦ �ϸ� �� ��. �� ����->��
		
		
		
		System.out.println("���� : "+age);
	//	System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.printf("����� Ű�� %.1f�Դϴ�.\n", height); // f�� formatted�� f�� ���̸� ���������� ��� �����ϴ�.
		// ���� %d, ���� %c, ���ڿ� %s, �Ǽ� %f 
		System.out.printf("�̸��� %s�Դϴ�.\n", name);
		
		
		
		System.out.println("JRE : �ڹ� ���� ȯ��");
		System.out.println("JDK : �ڹ� ���� ȯ��");
	}
}

/* 1. class Scanner�� �޼ҵ� (=c����� �Լ�)
   2. ���� - ���� int �Ǽ� double ���� char ���ڿ� String(���� �ڷ����� �ƴϱ� ������ �빮�� S) */