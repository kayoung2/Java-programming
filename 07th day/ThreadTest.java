class ThreadTest{
	public static void main(String[] args){
		// main() �� throws Exception�� Thread.sleep���� ���� ���� ���� ����
		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
			// 1�� ����
			try{
				Thread.sleep(1000); // ������ ms
			}catch(Exception e){
				System.out.println(e);
			} // �켱 �õ��غ��� ���ܰ� �߻��ϸ� ������ �Ѵ�.
		}
	}
}