import java.util.Scanner;

class Command{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		if(args.length<1){
			// args.length�� args �迭�� ũ��, �Լ��� �ƴ϶� () �� ����
			System.out.println("[�Է¿���] �ϳ��� ���ܾ �Է����� �ʾ� ���α׷��� �����մϴ�.");
			return;
		}
		
		int ja=0;
		int mo=0;
		
		for(int i=0;i<args[0].length();i++){
			// args[0].length�� args[0] ���ڿ��� ũ��� () ����
			if(((args[0].charAt(i)>='A')&&(args[0].charAt(i)<='Z'))||((args[0].charAt(i)>='a')&&(args[0].charAt(i)<='z'))){
				switch(args[0].charAt(i)){
					case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o':
					case 'U': case 'u':
					mo++;
					break;
					
					default:
					ja++;
					break;
				}
			}
		}
		
		System.out.println("���� ����: "+ja);
		System.out.println("���� ����: "+mo);
	}
}