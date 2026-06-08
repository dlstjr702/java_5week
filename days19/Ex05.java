package days19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 양인석
 * @date 2026. 6. 8. 오전 9:00:04
 * @subject  visual
 * @content 실행파일 복사 : 문자스트림X, 바이트스트림 O
 */

public class Ex05 {
	public static void main (String [] args) throws IOException {

		//      System.in.read();

		// 바이트 읽기 스트림
		//      InputStream is = System.in;
		//      
		//      System.out.print("> 한 문자 입력 : ");
		//      int b = is.read(); // 바이트
		//      System.out.println( b );

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 키보드 입력 + 엔터 -> System.in       -> InputStream[Reader]  -> Buffered[Reader]
		//                    바이트 읽기 스트림   문자 보조스트림           버퍼 문자 보조스트림
		//                    InputStream      바이트 -> 한문자 변환      [한][한][한][한]
		//                     '한'

		// br.readLine();    바이트 -> 한문자 -> 버퍼 문자열 -> 한라인문자열 전체를 읽기: readLine()
		
		
		// System.in 을 사용해서 한글 출력
		
		byte [] b = new byte[3];
		
		 InputStream is = System.in;
		 int totalBytes =  is.read(b); // 키보드로부터 읽어와서 byte배열 b 한테 저장
		 
		 
		 char one = new String(b).charAt(0);
		 
		 System.out.println(one);
		 
		 System.out.println("END");

	}//main

}//class


