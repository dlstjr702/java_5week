package days20;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 양인석
 * @date 2026. 6. 9. 오전 9:09:12
 * @subject 
 * @content  
 */

public class Ex03_02 {

	public static void main(String[] args) throws IOException {


		int [] score = {
				// 번호, 국어, 영어, 수학
				1, 100, 90, 90,
				2, 70 , 90,100,
				3, 100,100,100,
				4, 70 , 60, 80,
				5, 70 , 90,100
		};

		String name = ".\\score.dat";
		String mode = "rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){

			for (int i = 0; i < score.length; i++) {
				long fp =  raf.getFilePointer();
				if(i%4==0)System.out.println("=".repeat(50));
				System.out.printf("> 현재 FP: %d - [%d]\n",fp,score[i]);
				raf.writeInt(score[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		일시정지();// 파일 확인 목적
		
		
		//문제1
		//모든 학생의 번, 국,영,수 총점,평균 성적 정보를 출력
		int no,kor,eng,mat,tot;
		double avg;
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){

			for (int i = 0; i < score.length ; i+=4) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor+ eng+mat;
				avg=(double)tot/3;
				
				System.out.printf("번호 %d  국어%d 영어%d 수학%d 총점%d 평균%.2f\n ",no, kor,eng,mat,tot,avg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		일시정지();// 파일 확인 목적
		
		
		
		//문제 2
		//3번학생의 수학점수(100) -> 20점 수정
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			int pos = 44;
			raf.seek(pos);
			raf.writeInt(20);
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		일시정지();// 파일 확인 목적
		
		
		
		//문제3
		//3번 학생의 점수 출력
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			int pos = 32;
			raf.seek(pos);
			
			no = raf.readInt();
			kor = raf.readInt();
			eng = raf.readInt();
			mat = raf.readInt();
			tot = kor+ eng+mat;
			avg=(double)tot/3;
			
			System.out.printf("번호 %d  국어%d 영어%d 수학%d 총점%d 평균%.2f\n ",no, kor,eng,mat,tot,avg);
			
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
