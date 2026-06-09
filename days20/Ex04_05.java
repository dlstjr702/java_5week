package days20;

import java.io.File;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject   첨부파일 : 파일 업로드
 * @content   - 회원가입 폴더
 * 			  - 상품등록 폴더
 */				

public class Ex04_05 {

	public static void main(String[] args) {
		//days20 폴더안에 upload폴더 유뮤 확인하고 
		//만약에 존재하지 않으면 폴더생성...


		String pathname = ".\\src\\days20";
		File parent = new File(pathname);
		// parent.listFiles();
		
		File uploadFile = new File(parent, "upload");
		
		//System.out.println(uploadFile.exists());
		
		if ( !uploadFile.exists()) {
			
			
			//mkdir()와 mkdirs() 차이점
			//System.out.println(uploadFile.mkdir());  
			System.out.println(uploadFile.mkdirs()); 
			
		}
		
		//  

	}//main

}//class
