public class CalTime{
	public static void main(String [] args)
	{
		double distance = 400000000;
		double c = 3;
		double time = (distance / c)*60*60*24*365; // �ʴ��� -> �����
		
		System.out.println("�ɸ��� �ð��� "+time+"���Դϴ�.");
	}
}