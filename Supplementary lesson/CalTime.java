public class CalTime{
	public static void main(String [] args)
	{
		double distance = 400000000;
		double c = 3;
		double time = (distance / c)*60*60*24*365; // 초단위 -> 년단위
		
		System.out.println("걸리는 시간은 "+time+"년입니다.");
	}
}