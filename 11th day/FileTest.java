import java.io.File;
import java.util.Date;

class FileTest{
	public static void main(String[] args){
		File f = new File("C:\\Program Files"); // C:\Program Files ������ ��üȭ ��Ŵ: �� ������ f�� ���� ����
		File f1 = new File("C:"+File.separator+"Program Files"+File.separator+"Java"); // ������
		File f2 = new File("FileTest.class"); // ���� ���� ���� �ִٸ� ���ϸ�.Ȯ���ڷ� ���� ����: �����
		
		System.out.println(f.exists()); // ����?
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		
		Date d = new Date(f2.lastModified());
		System.out.println(d); // ������ ������
		
		System.out.println(f1.length()); // ���� ũ��
		System.out.println(f2.length());
		System.out.println(f.canRead()); // �б⿩��
		System.out.println(f2.canRead());
		System.out.println(f1.canWrite()); // ���⿩��
		System.out.println(f2.canWrite());
		System.out.println(f.isDirectory()); // ��������
		System.out.println(f.isAbsolute()); // ������?
		System.out.println(f2.isAbsolute());
		System.out.println(f1.getAbsolutePath()); // ������
		System.out.println(f2.getAbsolutePath());
	}
}