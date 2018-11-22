import java.util.Scanner;

class ProcessArray{
	public static void main(String[] args){
		double[] array = new double[10];
		
		initial(array);
		print(array);
		System.out.println("합: "+sum(array));
		System.out.println("최대값: "+largest(array));
		System.out.println("최대값의 index: "+index(array));
		print(suffle(array));
		// shuffle(array); // 셔플 후
		// print(array); // 출력
		rotateR1(array);
		rotateR1(array);
		rotateR1(array); // 오른쪽으로 3번 rotate
		print(array);
		rotateRI(array,4);
		print(array);
	}
	
	static void initial(double[] a){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) a[i] = Math.random()*10;
	}
	
	static void print(double[] a){
		for(int i=0;i<a.length;i++) System.out.printf("a[%d]: %f\n",i,a[i]);
	}
	
	static double sum(double[] a){
		double sum=0;
		for(int i=0;i<a.length;i++) sum+=a[i];
		
		return sum;
	}
	
	static double largest(double[] a){
		double b=a[0];
		for(int i=1;i<a.length;i++) if(b<a[i]) b=a[i];
		
		return b;
	}
	
	static int index(double[] a){
		double b=a[0]; // 일단은 첫번째 성분을 최댓값으로 가정
		int c=0;
		
		for(int i=1;i<a.length;i++){
			if(b<a[i]){
				b=a[i];
				c=i;
			}
		}
		return c;
	}
	
	static double[] suffle(double[] a){
		double tmp;
		int b;
		for(int i=0;i<a.length;i++){
			b = (int)(Math.random()*a.length);
			tmp=a[i];
			a[i]=a[b];
			a[b]=tmp; // 값을 서로 바꾸기 위한 것!
		}
		return a;
	}
	
	/*
	static void shuffle(double[] arr){
		// arr[0]<->arr[random]
		// arr[1]<->arr[random]
		// ...
		// arr[마지막 성분]<->arr[random]
		
		double tmp;
		int r;
		//arr[i]<->arr[r]
		for(int i=0;i<arr.length;i++){
			r = (int)(Math.random()*arr.length);
			tmp=arr[i];
			arr[i]=arr[r];
			arr[r]=tmp;
		}
	}
	*/
	
	static void rotateR1(double[] a){
		double tmp = a[a.length-1];
		
		for(int i=a.length-1;i>0;i--)
			a[i]=a[i-1]; // i = 1~a.length
		a[0]=tmp;
	}
	
	static void rotateRI(double[] a,int num){
		for(int i=0;i<num;i++){
			rotateR1(a);
		}
	}
	
}