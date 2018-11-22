public class GetMin{
	public static void main(String[] args){
		int[] s = {12,3,19,6,18,8,12,4,1,19};
		
		int min=s[0];
		
		for(int i=0;i<10;i++)
		{
			if(min < s[i]) //i+1을 넣으면 s[10]값 때문에 오류가 남
				min=min;
			else
				min=s[i];
		}
		
		System.out.print("최소값은 "+min);
	}
}