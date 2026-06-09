package days20;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 
 * @content  Piped[Reader]/Piped[Writer]
 * 			 - Reader, Writer 문자스트림
 * 			 - 스레드 간에 데이터를 주고 받을 때 사용하는 스트림.
 * 
 * 			RandomAccessFile 스트림
 * 			- 파일의 어느 위치에서나 읽기/쓰기가 가능한 스틞 (장점)
 * 			- seek(index) 위치값을 잡는메서드
 * 			- getFilePointer()
 * 				 파일포인터
 */

public class Ex03 {

	public static void main(String[] args) throws IOException {


		//[1] 간단하게 테스트
		/*
		String name = ".\\test.txt";
		String mode = "rw";
		try (
				RandomAccessFile raf = new RandomAccessFile(name, mode);
				){
			System.out.println(">파일포인터의 위치: " + raf.getFilePointer());
			raf.writeInt(100);// 4바이트 int
			System.out.println(">파일포인터의 위치: " + raf.getFilePointer());
			raf.writeLong(200L); // 8바이트 
			System.out.println(">파일포인터의 위치: " + raf.getFilePointer());
			raf.seek(0);
			System.out.println(">파일포인터의 위치: " + raf.getFilePointer());


		} catch (Exception e) {
			e.printStackTrace();
		}
		 */



		//[2]
		String s = "I Love normal Java";
		String q = "javabook";
		String name = ".\\random.txt";
		String mode = "rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){

			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		}


		일시정지();// 파일 확인 목적

		
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			raf.writeBytes(q);
		} catch (Exception e) {
			e.printStackTrace();
		}


		일시정지();// 파일 확인 목적
		
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}


	private static void 일시정지() throws IOException { 
		System.out.println("> 엔터 치면 진행한다. ");
		System.in.read();
		System.in.skip(System.in.available()); // 13, 10 제거
	}

}
