class ThreadTest{
	public static void main(String[] args){
		// main() 뒤 throws Exception은 Thread.sleep으로 인한 오류 막기 위함
		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
			// 1초 쉬기
			try{
				Thread.sleep(1000); // 단위가 ms
			}catch(Exception e){
				System.out.println(e);
			} // 우선 시도해보고 예외가 발생하면 적히게 한다.
		}
	}
}