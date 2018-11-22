// 3번째 성분을 13으로 변경

class Kkang{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5};
		change(arr[2]);
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr[2]);
	}
	
	// 3번째 성분을 13으로 변경하는 메소드 1
	static void change(int a){ // a=3
		a=13; // a=13, 배열에 실제로 접근하지 못함
	}
	
	// 3번째 성분을 13으로 변경하는 메소드 2
	static void change(int[] a){ // 매개변수가 다르기 때문에 이름 같아도 ㄱㅊ, 중복정의
		a[2]=13;
	}
}