import java.lang.Math;

public class RandomWalk{
	public static void main(String[] args){
		char[][] room = new char[10][10];
		int k = (int)(Math.random()*3);
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				room[i][j]='.';
			}
		}
		
		System.out.println("---------------------");
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(room[i][j]+" ");
			}
			
			System.out.println("");
		}
		
		System.out.println("---------------------");
	}
	
}