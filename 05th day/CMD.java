class CMD{
	public static void main(String[] args){
		if(args.length<2) return;
		
		System.out.print(Integer.parseInt(args[0])*Integer.parseInt(args[1]));
	}
}