package days20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 시간표.pdf 450kb
 * @content   50KB
 * 			  여러개의 파일로 분할
 *            -> 시간표-1.pdf
 *            -> 시간표-2.pdf
 *                     번호
 *            -> 합치기.
 */

public class Ex08 {

	   public static void main(String[] args) {
	      String parent = ".\\src\\days20";
	      String child = "시간표.pdf";
	      File f = new File( parent, child );
	      
//	      System.out.println( f.length() +"(bytes)" );  460800(bytes)
	      final int VOLUME = 1024 * 50; // 50KB
	      
	      String fileName = f.getName();
	      int index = fileName.indexOf(".");
	      String baseFileName = fileName.substring(0, index) ; // 시간표
	      String ext =  fileName.substring(index) ;            // .pdf
	      
	      // 바이트 스트림 쓰기(저장)
	      FileOutputStream fos = null;
	      BufferedOutputStream bos = null; // 보조스트림
	      
	      int code = 0;
	      int i = 0;   // 50kb
	      index = 0;  // 시간표-1.pdf
	      
	      try (
	         FileInputStream in = new FileInputStream(f);
	         BufferedInputStream bis = new BufferedInputStream(in);   
	            ){
	         
	         while(  (code = bis.read() ) != -1 ) {
	            if( i%VOLUME == 0 ) { // 50KB
	               if( i != 0 ) bos.close(); // 파일 실제 저장...

	               // 시간표-2.pdf
	               child =  String.format("%s-%d%s", baseFileName, ++index, ext);
	               File temp = new File(parent, child);
	               fos = new FileOutputStream(temp);
	               bos = new BufferedOutputStream(fos);
	            }
	            
	            bos.write(code);
	            i++;
	         } // while
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      System.out.println( " END ");
	      
	   } // main

	} // class




