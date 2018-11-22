// 커맨드라인에서 정수 배열을 입력받아
// 배열 출력하는 메소드
// 배열을 오름차순 정렬 메소드

import java.util.Scanner;

class Command{
	public static void main(String [] args){ // java Command 4 5 1 3 70 8 41
		if(args.length==0){ // 배열의 길이는 소괄호x 문자열의 길이는 소괄호o
			System.out.println("배열 원소가 존재하지 않습니다.");
			return; // main메소드를 종료
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
		
		// for-each문
		// 장점: 배열길이를 몰라도 됨: a.length를 쓰지 않아도 됨
		// 단점: 배열 성분 변경은 불가
		
		// for(배열의 자료형 변수명:배열명){배열에서 처리할 일들;}
		for(int x:a){ // x = 1 2 3 4 5 배열의 자료가 차례차례 x로
			System.out.printf("%d\t",x);
		}
		System.out.println();
	}
	
	// for-each문 사용해서 배열 성분값을 1씩 증가시키고 출력
	
	public static void ppeul(int[] a){
		// for(int i=0;i<a.length;i++) a[i]+=1;
		
		for(int x:a){ // 배열 성분의 복사본을 넘겨받기 때문에 직접적으로 성분 변경 불가
			x+=1;
		}
	}
	
	public static void oreum(int[] a){
		int tmp=0;
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				// a[i]가 더 크다면 a[i]<->a[j]
				if(a[i]>a[j]){
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
	}
}