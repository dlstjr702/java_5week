package days20;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 직렬화 (Serailization) : 객체를 파일/ 네트워크 입출력하기 위해서 만든 스트림으로 만드는 것.
 * @content 역직렬화 (DEserailiztion)  
 * 			ObjectInputStream  역직렬화    스트림 -> 객체 복원 
 * 			ObjectOutputStream 직렬화      객체 -> 스트림
 * 
 * 			UserInfo 클래스 객체 생성해서 직렬화시켜서 파일 쓰기/읽기
 */

public class Ex09 {

	public static void main(String[] args) {


		UserInfo u1 = new UserInfo("홍길동","1234",25);
		UserInfo u2 = new UserInfo("권태정","1234",28);
		
	

		
		String name = ".\\src\\days20\\UserInfo.ser";
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();			
		
		try (
				FileOutputStream out = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(out);
				){
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			list.add(u1);
			list.add(u2);
			
			
			oos.flush();
			System.out.println("u1,u2 객체를 직렬화 해서 파일로 저장!!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");


	} // main

} // class




