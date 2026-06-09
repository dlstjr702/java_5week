package days20;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject [ File 클래스 ]
 * @content  - 파일, 디렉토리(폴더)를 관리할 수 있는 기능이 구현된 클래스 
 */

public class Ex04_03 {

	public static void main(String[] args) {

		String userDir = System.getProperty("user.dir");
		File parent = new File(userDir);


		//javaPro 디렉토리 안에 있는 .dat 파일만 출력


		//[1]
		/*
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if(f.isFile()) {
				String fileName = f.getName();
				String ext = fileName.substring(fileName.indexOf("."));

				if(ext.equals(".dat")) {
					System.out.println(fileName);
				}//if

			}//if
		}//for
		 */

		//[2]
		//		File [] list = parent.listFiles(new FileFilter() {
		//
		//			@Override
		//			public boolean accept(File f) {
		//
		//				return f.getName().endsWith("dat");
		//			}
		//		});
		//		for (File f : list) {
		//			System.out.println(f.getName());
		//
		//		}


		//람다식 수정
		//File [] list = parent.listFiles(f ->  f.getName().endsWith("dat"));
		
		
		// 배열, 컬렉션 -> 스트림
//		Arrays.stream(list).forEach(new Consumer<File>() {
//
//			@Override
//			public void accept(File f) {
//				System.out.println(f.getName());
//				
//			}
//			
//		});
		
		//Arrays.stream(list).forEach((f)-> System.out.println(f.getName()));//람다식
		//Arrays.stream(list).forEach((f)-> System.out.println(f));//람다식
		//Arrays.stream(list).forEach( System.out::println);//메소드 참조
		


		
		
		//[3 ]
		
		
		
		
	}//main

}//class
