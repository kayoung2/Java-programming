/* for(초기화;조건;증감문(추가적으로 실행할 문장))
	반복문장 */

import java.util.Scanner;

class test6{ // 직사각형
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<6;i++){
			for(int j=0;j<10;j++){
				System.out.print("*");
			}
			System.out.println("");
		} 
		
	}
}