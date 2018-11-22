class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		//a�� ���� ��� : 10����(decimal), 8����(octal), 16����(hexadecimal)
		
		System.out.printf("%d %o %X %h\n", a, a, a, a); // ���� ���̿� ��ǥ ���� ��
		// %x��ſ� %X�� ������ �빮�ڷ� ���
		System.out.printf("%d %1$o %1$x\n", a); // 1$ ù��° ���ڸ� ����ϰڴٴ� ��
		System.out.printf("%d %1$#o %1$#x\n", a); // $��ȣ �ڿ� #�� ���̸� �� �������� ǥ��
		
		// a, b, c�� ���
		
		System.out.printf("%5d\t%5d\t%5d\n",a, b, c); // \t�� tap��ŭ ������ ���
		System.out.format("%+5d\t%+-5d\t%5d\n",a, b, c); // printf�� format�� ���� �����ϰ� ���
		/* %�� 5d ���̿� +�� ���� ��� ����� ��ȣ�� ǥ�õȴ�.
		%�� d������ ���ڴ� �׸�ŭ ������ Ȯ���϶�� ���̴�.
		%�� d������ -�� ���� ������ �ǹ��Ѵ�. */
		
		// ���� ������ ���� ���� -> �� ���� �����ϰ� ���� �ڷᵵ �÷� �ֽ�
		
		float f = (float)3.14;
		float g = 3.14F;
		/* 3.14�� �Ǽ��� �Ǽ��� �⺻ Ÿ���� double������ �����Ѵ�.
		���� doubleŸ���� float�� ������ �ڷ� �ս��� �߻��ϹǷ� ������ �߻��Ѵ�.
		�ذ� ��� 1 : casting (�ڷ���)
		�ذ� ��� 2 : ���̻� ���̱�*/
		
		System.out.format("%5.2f %5.2f\n", f, g);
	}
}