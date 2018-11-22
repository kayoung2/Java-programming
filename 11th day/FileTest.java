import java.io.File;
import java.util.Date;

class FileTest{
	public static void main(String[] args){
		File f = new File("C:\\Program Files"); // C:\Program Files 폴더를 객체화 시킴: 이 폴더는 f로 접근 가능
		File f1 = new File("C:"+File.separator+"Program Files"+File.separator+"Java"); // 절대경로
		File f2 = new File("FileTest.class"); // 같은 폴더 내에 있다면 파일명.확장자로 접근 가능: 상대경로
		
		System.out.println(f.exists()); // 존재?
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		
		Date d = new Date(f2.lastModified());
		System.out.println(d); // 마지막 수정일
		
		System.out.println(f1.length()); // 파일 크기
		System.out.println(f2.length());
		System.out.println(f.canRead()); // 읽기여부
		System.out.println(f2.canRead());
		System.out.println(f1.canWrite()); // 쓰기여부
		System.out.println(f2.canWrite());
		System.out.println(f.isDirectory()); // 폴더여부
		System.out.println(f.isAbsolute()); // 절대경로?
		System.out.println(f2.isAbsolute());
		System.out.println(f1.getAbsolutePath()); // 절대경로
		System.out.println(f2.getAbsolutePath());
	}
}