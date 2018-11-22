import java.util.Scanner;

class ArrayTest{
	public static void main(String[] args){
		double[] score = new double[5];
		
		inputScore(score);
		printAvr(score);
		
		/*
		Scanner s = new Scanner(System.in);
		
		// score.length = score 배열의 원소 개수
		for(int i=0;i<score.length;i++){
			System.out.printf("학생 %d의 점수: ",i+1);
			score[i] = s.nextDouble();
		}
		
		double sum=0;
		
		for(int i=0;i<score.length;i++){
			System.out.printf("학생 %d의 점수: %.2f\n",i+1,score[i]);
			sum+=score[i];
		}
		System.out.printf("학생들 점수의 평균은 %.2f입니다.\n",sum/score.length);
		
	}
	*/
}
	static void inputScore(double[] score){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<score.length;i++){
			System.out.printf("학생 %d의 점수: ",i+1);
			score[i] = s.nextDouble();
		}
	}
	
	static void printScore(double[] s){
		for(int i=0;i<s.length;i++){
			System.out.printf("학생 %d의 점수: %.2f\n",i+1,s[i]);
		}
	}
	
	// 평균 출력하는 메소드 작성
	static void printAvr(double[] a){
		double sum=0;
		
		for(int i=0;i<a.length;i++) sum+=a[i];
		
		System.out.printf("학생들 점수의 평균은 %.2f입니다.\n",sum/a.length);
	}
	
	
}