class TwoDimArr{
	public static void main(String [] args){
		int [][] arr = new int [3][2];
		initArr(arr);
		printArr(arr);
		System.out.println("��� ��: "+sumArr(arr));
		int [] sumAr = colSum(arr);
		for(int i=0; i<sumAr.length; i++)
			System.out.printf("%d�� �� ��: %d\n", i, sumAr[i]);
		//indOfMax(arr)=�迭
		System.out.printf("%d��, %d���� �ִ� ��ġ��\n", indOfMax(arr)[0]+1, indOfMax(arr)[1]+1);
		
		shuffle(arr);
		printArr(arr);
		System.out.printf("�ະ ���� �ִ� : %d\n", maxRowSum(arr));
		
	}
	static void initArr(int [][] arr){//1
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = (int)(Math.random()*10);
		}
	}
	static void printArr(int [][] arr){//2
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
	}
	static int sumArr(int [][] arr){//3
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	static int [] colSum(int [][] arr){//4
		int [] colSumArr = new int[arr[0].length];
		
		//���� �� 0���� �ʱ�ȭ
		for(int i=0; i<colSumArr.length; i++)
			colSumArr[i]=0;
		
		//���� �� ���
		for(int j=0; j<arr[0].length; j++){
			for(int i=0; i<arr.length; i++){
				colSumArr[j] += arr[i][j];
			}
		}
		//���� �� ��ȯ
		return colSumArr;
	}
	 
	static int maxRowSum(int [][] arr){ //5
		int sum;
		int max = 0;
		
		for(int i=0; i<arr.length;i++){
			sum = 0;
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
			if(max<sum) max = sum;
		}
		return max;
	}
	
	static int[] indOfMax(int [][] arr){//6
		int [] index = {0,0};
		int max = arr[0][0];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0 ; j<arr[0].length; j++){
				if(max<arr[i][j]){
					max = arr[i][j];
					index[0] = i;//���� i
					index[1] = j;//���� j
				}
			}
		}
		
		return index;
	}
	
	static void shuffle(int [][] arr){//7
		int r, c;
		int tmp;
		//arr[i][j]<->arr[r][c]
		for(int i=0; i<arr.length; i++){
			for(int j=0 ; j<arr[0].length; j++){
				r = (int)(Math.random()*arr.length);
				c = (int)(Math.random()*arr[0].length);
				tmp = arr[i][j];
				arr[i][j] = arr[r][c];
				arr[r][c] = tmp;
			}
		}
	}
}