class ArrTest1{
	public static void main(String [] args){
		double [] arr = new double[10];
		initArr(arr);
		printArr(arr);
		System.out.printf("��: %.2f\n", sumArr(arr));
		System.out.printf("�ִ�: %.2f\n", maxEltOfArr(arr));
		System.out.printf("�ִ��� �ε���: %d\n", indOfMax(arr));
		shuffle(arr);
		System.out.println("������: ");
		printArr(arr);
		
		System.out.println("���������� 1ĭ �����̼�: ");
		rotateR1(arr); //���������� 1ĭ �����̼�
		printArr(arr);
		
		System.out.println("���������� 3ĭ �����̼�: ");
		rotateRI(arr, 3);//���������� 3ĭ �����̼�
		printArr(arr);
		
		System.out.println("�������� 1ĭ �����̼�: ");
		rotateL1(arr);//�������� 1ĭ �����̼�
		printArr(arr);
		
		System.out.println("�������� 4ĭ �����̼�: ");
		rotateLI(arr, 4);//�������� 4ĭ �����̼�
		printArr(arr);
		
		System.out.println("�������� ����: ");
		ascending(arr);//�������� ����
		printArr(arr);
		
		System.out.println("�������� ����: ");
		descending(arr);//�������� ����
		printArr(arr);
		
	}
	//�������� ����
	static void descending(double [] arr){
	//�տ� ��ġ�� ���Ұ� �ڿ� ��ġ�� ���Ұ� �� �۴ٸ� ��ġ ��ȯ
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]<arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	//�������� ����
	static void ascending(double [] arr){
	//�տ� ��ġ�� ���Ұ� �ڿ� ��ġ�� ���Ұ� �� ũ�ٸ� ��ġ ��ȯ
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	//�������� ��ĭ �����̼�
	static void rotateL1(double [] arr){
		double tmp = arr[0];//ù��° ���Ҵ� �ӽ÷� ����
		for(int i=1; i<arr.length; i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tmp;//������ �ڸ��� �����ص� ù��° ���� ����
	}
	
	//�������� iĭ �����̼�
	static void rotateLI(double [] arr, int rot){
		for(int i=0; i<rot; i++) rotateL1(arr);
	}
	
	
	
	static void rotateRI(double [] arr, int rot){
		for(int i=0; i<rot; i++) rotateR1(arr);
	}
	
	static void rotateR1(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--){
			arr[i]= arr[i-1];
		}
		arr[0] =tmp;
	}
	
	static void shuffle(double [] dA){
		int r;
		double tmp;
		//
		for(int i=0; i<dA.length; i++){
			//dA[i] <-> dA[??�����ε���]
			r = (int)(Math.random()*dA.length);
			//dA[i] 3 <-> dA[r]7.2
			tmp = dA[i];//3
			dA[i] = dA[r];	//7.2
			dA[r] = tmp; //3
			
		}
	}
	
	
	
	static int indOfMax(double [] arr){
		double max = arr[0];
		int index=0;
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	
	
	static double maxEltOfArr(double [] arr){
		double max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	static double sumArr(double [] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i]; 
		
		return sum;
	}
	static void initArr(double [] arr){
		for(int i=0; i<arr.length; i++)
			arr[i] = Math.random()*10;
	}
	static void printArr(double [] arr){
		for(int i=0; i<arr.length; i++)
			System.out.format("%.2f\t", arr[i]);
			
		System.out.println();	
	}
	
}







