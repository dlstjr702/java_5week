package days20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 
 * @content  
 */

public class Ex07 {

	public static void main(String[] args) {


		String pathname = ".\\src\\days19";
		File parent = new File(pathname );
		//File[] jf = parent.listFiles(f-> f.getName().endsWith("java"));

		String keyword = "parent";



		quickSerach(parent,keyword);

		System.out.println("END");



	}//main



	private static void quickSerach(File parent, String keyword) {

		File [] list = parent.listFiles();
		int  lineNumber = 0;
		File f = null;
		String line = null;

		for (int i = 0; i < list.length; i++) {
			f = list[i];

			if ( f.isDirectory() ) { // 하위 디렉토리
				quickSerach( f, keyword);
			} else {
				lineNumber = 1;             
				String fileName = f.getName();

				try (
						FileReader in = new FileReader(f);
						BufferedReader br = new BufferedReader(in);
						){

					while ( ( line = br.readLine() ) != null) {
						if ( line.contains(keyword) ) {

							//		                     line = line.replaceAll( keyword, "["+ keyword+"]");
							line = line.replaceAll( keyword, "<span style='color:red'>"+ keyword+"</span>");

							System.out.printf( "%s: %d: %s\n"
									, fileName, lineNumber, line );
						} // 
						lineNumber++;
					} // while

				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if

		} // for i

	} // quickSearch



}//class
