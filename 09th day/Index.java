// ������ �迭�� �Ű������� �޾� �ּڰ��� �ε����� ��ȯ�ϴ� �޼ҵ�

class Index{
	public static void main(String[] args){
		double[][] arr={{11,5,7,4},{10,3,4,2}};
		
		int[] index = indexOfMin(arr);
		System.out.printf("�ּڰ��� %d�� %d���� ��ġ\n",index[0],index[1]);
		System.out.printf("�ּڰ��� %d�� %d���� ��ġ\n",indexOfMin(arr)[0],indexOfMin(arr)[1]);
	}
	
	static int[] indexOfMin(double[][] a){
		double min = a[0][0];
		int[] index = {0,0};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(min>a[i][j]){
					min=a[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		
		return index;
		
		/*
		int row=0;
		int col=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(min>a[i][j]){
					min=a[i][j];
					row=i;
					col=j;
				}
			}
		}
		
		return format("(%d, %d)",row,col);
		*/
	}
}