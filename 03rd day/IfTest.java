import java.util.Scanner;

class IfTest{
	public static void main(String [] args){
		/*
		if(����){
			������ ����;
		}
		*/
		
		/*
		if(����){}
		else{}
		*/
		
		int point = 90;
		// 70�� �̻��̸� �հ�, �ƴϸ� ���հ�
		
		if(point>=70)
			System.out.println("�հ��Դϴ�!");
		else
			System.out.println("���հ��Դϴ�.");
		
		// 90�� �̻��̸� ���б�, 70�� �̻��̸� ������ ����, �ƴ϶�� ���հ��Դϴ�
		
		if(point>=90)
			System.out.println("���б�");
		else if(point>=70)
			System.out.println("������ ����"); // 70���̻� 90���̸�
		else
			System.out.println("���հ�");
	}
}