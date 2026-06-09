package days20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject  days19 폴도 안에 모든 자바 파일 찾아서 
 * @content  "parent" 문자열을 가지고 있는 파일명과 라인번호를 출력
 */

public class Ex04_04 {

	public static void main(String[] args) {

		String pathname = ".\\src\\days19";
		File parent = new File(pathname );
		File[] jf = parent.listFiles(f-> f.getName().endsWith("java"));
		String keyword = "parent";


		for (int i = 0,lineNumber = 0; i < jf.length; i++) {
			File f = jf[i];
			lineNumber =1;
			String fileName = f.getName();
			String line = null;

			try (
					FileReader in = new FileReader(f);
					BufferedReader br = new BufferedReader(in)
					){
				while ((line =br.readLine()) != null) {
					if(line.contains(keyword)) {
						
						line.replaceAll(keyword, "["+keyword+"]");
						
						System.out.printf("%s : %d : %s \n",fileName,lineNumber,line);
					}//if
					lineNumber++;

				}//while




			} catch (Exception e) {
				e.printStackTrace();
			}

		}//for


	}//main

}//class
