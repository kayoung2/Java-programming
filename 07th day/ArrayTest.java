import java.util.Scanner;

class ArrayTest{
	public static void main(String[] args){
		double[] score = new double[5];
		
		inputScore(score);
		printAvr(score);
		
		/*
		Scanner s = new Scanner(System.in);
		
		// score.length = score �迭�� ���� ����
		for(int i=0;i<score.length;i++){
			System.out.printf("�л� %d�� ����: ",i+1);
			score[i] = s.nextDouble();
		}
		
		double sum=0;
		
		for(int i=0;i<score.length;i++){
			System.out.printf("�л� %d�� ����: %.2f\n",i+1,score[i]);
			sum+=score[i];
		}
		System.out.printf("�л��� ������ ����� %.2f�Դϴ�.\n",sum/score.length);
		
	}
	*/
}
	static void inputScore(double[] score){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<score.length;i++){
			System.out.printf("�л� %d�� ����: ",i+1);
			score[i] = s.nextDouble();
		}
	}
	
	static void printScore(double[] s){
		for(int i=0;i<s.length;i++){
			System.out.printf("�л� %d�� ����: %.2f\n",i+1,s[i]);
		}
	}
	
	// ��� ����ϴ� �޼ҵ� �ۼ�
	static void printAvr(double[] a){
		double sum=0;
		
		for(int i=0;i<a.length;i++) sum+=a[i];
		
		System.out.printf("�л��� ������ ����� %.2f�Դϴ�.\n",sum/a.length);
	}
	
	
}