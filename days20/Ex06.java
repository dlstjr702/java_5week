package days20;

import java.io.File;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 
 * @content  
 */

public class Ex06 {

	public static void main(String[] args) {

		
		/*
		File f = new File(".\\sample");
		//f.mkdir();
		
		System.out.println(f.delete());
		*/
		
		
		//[2] temp
		File f = new File(".\\temp");
		
		
		//폴더 안의 하위 폴더 또는 파일이 없어야 삭제가 가능핟..
		//if(f.exists()) {
		//	System.out.println(f.delete()); 			
		//}
		
		
		directoryDelete(f);
		
		System.out.println("END");
		
		
		
		
	}//main

	private static void directoryDelete(File f) {
		while ( !f.delete() ) { //하위폴더O
			File[] list =  f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if(list[i].delete()) {
					System.out.printf("%s 삭제완료 \n",list[i]);
				}else {
					directoryDelete(list[i]);
				}
				
			}
			
		}//while
		
	}


}//class
