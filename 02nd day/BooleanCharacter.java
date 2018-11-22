public class BooleanCharacter{
	public static void main(String[] args){
		char a = 'h'; // 문자는 작은 따옴표 안에 문자 하나만!!!
		char b = '\uac00'; // u는 유니코드를 의미, ac00은 가를 의미
		String h = "hello"; // 문자열은 큰 따옴표 안에
		boolean b1 = true;
		boolean b2 = 3>4;
		
		System.out.println(b1+" "+b2);
		System.out.println(b+"영");
	}
}