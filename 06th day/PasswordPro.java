class PasswordPro{
	public static void main(String[] args){
		System.out.println(pw("java"));
		System.out.println(pw("Java"));
	}
	static boolean pw(String s){
		String password = "Java";
		return password.equals(s);
	}
}