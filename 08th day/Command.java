// Ŀ�ǵ���ο��� ���� �迭�� �Է¹޾�
// �迭 ����ϴ� �޼ҵ�
// �迭�� �������� ���� �޼ҵ�

import java.util.Scanner;

class Command{
	public static void main(String [] args){ // java Command 4 5 1 3 70 8 41
		if(args.length==0){ // �迭�� ���̴� �Ұ�ȣx ���ڿ��� ���̴� �Ұ�ȣo
			System.out.println("�迭 ���Ұ� �������� �ʽ��ϴ�.");
			return; // main�޼ҵ带 ����
		}
		
		int[] arr = new int[args.length];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		
		print(arr);
		oreum(arr);
		print(arr);
	}
	
	public static void print(int[] a){
		/* for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		
		System.out.println(); */
		
		// for-each��
		// ����: �迭���̸� ���� ��: a.length�� ���� �ʾƵ� ��
		// ����: �迭 ���� ������ �Ұ�
		
		// for(�迭�� �ڷ��� ������:�迭��){�迭���� ó���� �ϵ�;}
		for(int x:a){ // x = 1 2 3 4 5 �迭�� �ڷᰡ �������� x��
			System.out.printf("%d\t",x);
		}
		System.out.println();
	}
	
	// for-each�� ����ؼ� �迭 ���а��� 1�� ������Ű�� ���
	
	public static void ppeul(int[] a){
		// for(int i=0;i<a.length;i++) a[i]+=1;
		
		for(int x:a){ // �迭 ������ ���纻�� �Ѱܹޱ� ������ ���������� ���� ���� �Ұ�
			x+=1;
		}
	}
	
	public static void oreum(int[] a){
		int tmp=0;
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				// a[i]�� �� ũ�ٸ� a[i]<->a[j]
				if(a[i]>a[j]){
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
	}
}