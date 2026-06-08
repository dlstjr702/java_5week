package days19;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author 양인석
 * @date 2026. 6. 8. 오전 9:00:04
 * @subject DataInputStream/DataOutputStream  
 * @content     바이트스트림        
 */

public class Ex06 {
	public static void main (String [] args){

		String name = "홍길동";

		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;

		String fileName = ".\\student02.dat"; //[dat]a


		try (
				FileOutputStream out = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(out);
				){
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);


		} catch (Exception e) {
			e.printStackTrace();
		}







	}//main

}//class


