package days20;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오후 3:29:34
 * @subject 시간표-1.pdf ~ 시간표-9.pdf  분할
 * @content Ex02.java
 * 
 */
public class Ex08_02 {

   public static void main(String[] args) throws IOException {
      
      Vector<FileInputStream> v = new Vector<>();
      
      for (int i = 1; i <= 9; i++) {
         String name = ".\\src\\days20\\시간표-"+i+".pdf";
         FileInputStream fis = new FileInputStream(name);
         v.add(fis);
      }
      
      Enumeration<FileInputStream> en = v.elements(); // 열거자
      // 시간표-1~9.pdf 을 각각 FileInputStream 객체를 생성해서 -> SequenceInputStream 객체 생성
      SequenceInputStream sis = new SequenceInputStream(en);
      
      FileOutputStream fos = new FileOutputStream(".\\src\\days01\\시간표.pdf");

      int b;
      while( (b = sis.read()) != -1 ) {
         fos.write(b);
      } // while
      
      fos.close();
      sis.close();
      
      System.out.println(" END ");
   } // main

} // class
