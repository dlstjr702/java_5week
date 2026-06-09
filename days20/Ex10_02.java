package days20;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject UserInfo u1,u2   -> 직렬화 
 * @content   ArrayList<UserInfo> list      -> 직렬화
 * 
 * 
 * 			userinfo.ser -> 역직렬화해서 사용(출력)
 * 			
 */

public class Ex10_02 {

	public static void main(String[] args) {

		String name = ".\\src\\days20\\Child.ser";
		

		try (
				FileInputStream in = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(in);
				){
			
			 Child c1 = (Child)ois.readObject();
			 
			 
			 System.out.println(c1.name);
			 System.out.println(c1.age);
			 System.out.println(c1.email);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
		

	} // main

} // class




