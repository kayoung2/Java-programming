class Arr{
	public static void main(String[] args){
		double[][] arr = new double[3][2];
		
		initial(arr);
		System.out.println();
		print(arr);
		System.out.println();
		sum(arr);
		System.out.println();
		colSum(arr);
		System.out.println();
		largeSum(arr);
		System.out.println();
		index(arr);
		System.out.println();
		shuffle(arr);
		print(arr);
	}
		
	static void initial(double[][] a){
		double r=0;
		for(int i=0;i<a.length;i++){ // 행개수
			for(int j=0;j<a[0].length;j++){ // a[0]이 있는 행의 열개수
				r = Math.random()*10;
				a[i][j] = r;
			}
		}
	}
		
	static void print(double[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.printf("%3f ",a[i][j]);
			}
			System.out.println();
		}
	}
		
	static void sum(double[][] a){
		double sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				sum+=a[i][j];
			}
		}
		System.out.println("모든 원소들의 합: "+sum);
	}
		
	static void colSum(double[][] a){
		for(int i=0;i<a[0].length;i++){
			double sum2=0;
			
			for(int j=0;j<a.length;j++){
				sum2+=a[j][i];
			}
			System.out.println((i+1)+"열의 원소들의 합: "+sum2);
		}
	}
		
	static void largeSum(double[][] a){
		double tmp=0;
		int row=0;
		for(int i=0;i<a.length;i++){
			double sum3=0;
				
			for(int j=0;j<a[0].length;j++){
				sum3+=a[i][j];
			}
			System.out.println((i+1)+"행의 원소들의 합: "+sum3);
			
			if(tmp<sum3){
				row=i;
				tmp=sum3;
			}
		}
		System.out.println();
		System.out.println("원소들의 합이 가장 큰 행은 "+(row+1)+"번째 행입니다.");
	}
		
	static void index(double[][] a){
		double tmp=a[0][0];
		int row=0;
		int col=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(tmp<a[i][j]){
					row=i+1;
					col=j+1;
					tmp=a[i][j];
				}
			}
		}
		System.out.println("가장 큰 원소의 index는 ("+row+","+col+") 입니다.");
	}
		
	static void shuffle(double[][] a){
		int r1=0;
		int r2=0;
		double tmp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				r1=(int)(Math.random()*a.length);
				r2=(int)(Math.random()*a[0].length);
					
				tmp=a[i][j];
				a[i][j]=a[r1][r2];
				a[r1][r2]=tmp;
			}
		}
		System.out.println("셔플 후");
	}
	
}