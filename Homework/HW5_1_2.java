public class HW5_1_2{
	public static void main(String[] args){
		setCoord(6,3);
		setCoord(3,6,2);
	}
	static void setCoord(int i,int j){
		System.out.println("x,y coordinates: ("+i+", "+j+")");
	}
	static void setCoord(int i,int j,int k){
		System.out.println("x,y,z coordinates: ("+i+", "+j+", "+k+")");
	}
}