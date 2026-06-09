package days20;

import java.io.File;
import java.io.IOException;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject [ File 클래스 ]
 * @content  - 파일, 디렉토리(폴더)를 관리할 수 있는 기능이 구현된 클래스 
 */

public class Ex04 {

	public static void main(String[] args) throws IOException {


		//String pathname = ".\\src\\days25";
		//String pathname = ".\\src\\days20";
		String pathname = ".\\src\\days20\\Ex01.java";
		File f = new File(pathname);
		
		System.out.println(f.exists());  //존재하는지?
		System.out.println(f.isFile());  //파일인지?
		System.out.println(f.isDirectory()); // 폴더인지?
		
		System.out.println(File.pathSeparator);  // ;
		System.out.println(File.separator);     // \
		
		
		//파일명가져오기
		String fileName = f.getName();
		System.out.println(fileName);
		
		//순수파일명
		
		String orgName = fileName.substring(0, fileName.lastIndexOf("."));
		String lastName = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(orgName);
		System.out.println(lastName);
		
		
		System.out.println("=".repeat(50));
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		
		System.out.println("=".repeat(50));
		System.out.println(f.getParent()); //String
		File pf = f.getParentFile();  //File
		System.out.println(pf);


	}

}
 