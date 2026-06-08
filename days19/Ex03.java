package days19;

import java.io.File;
import java.io.FileReader;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 양인석
 * @date 2026. 6. 8. 오전 9:00:04
 * @subject  Chapter 18 IO(입출력)
 * @content 
 */

public class Ex03 {
	public static void main (String [] args) {


		String parent = ".\\src\\days19";
		String Child ="Ex01.java";
		//파일, 디렉토리(폴더) 다루는 기능이 구현된 클래스 : File
		File file = new File(parent, Child);


		System.out.println(file.length()+"bytes");
		System.out.println(file.lastModified());

		//[1]
		//System.out.println(new Date(file.lastModified()));
		
		//[2]
		long time = file.lastModified();
		LocalDateTime dt = toLocalDateTime(time);
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println(dt.format(dtf));
		
		
		System.out.println(file.isDirectory()); //false
		System.out.println(file.isFile()); //true



		try (
				// 문자 스트림 ( 읽기용도의 스트림)
				FileReader reader = new FileReader(file);
				){

			int code;
			while ( (code =  reader.read()) != -1 ) {
				System.out.println((char)code);
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}




	}//main



	public static LocalDateTime toLocalDateTime(long time) {
		return LocalDateTime.ofInstant(
				Instant.ofEpochMilli(time),
				ZoneId.systemDefault());
	}




}//class


