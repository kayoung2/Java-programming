class Nerim{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("Ŀ�ǵ� ���λ� �Էµ� ���ڿ��� �������� �ʽ��ϴ�.");
			return;
		}
		
		String tmp;
		for(int i=0;i<args.length-1;i++){
			for(int j=i+1;j<args.length;j++){
				if(args[i].length()<args[j].length()){
					tmp=args[i];
					args[i]=args[j];
					args[j]=tmp;
				}
				else if(args[i].length()==args[j].length()){
					if(args[i].charAt(0)>args[j].charAt(0)){
						tmp=args[i];
						args[i]=args[j];
						args[j]=tmp;
					}
				}
			}
		}
		
		for(int i=0;i<args.length;i++) System.out.printf("%s \t",args[i]);
		System.out.println();
	}
}