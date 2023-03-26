package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			// BufferedOutputStream의 버퍼 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			// 파일 123.txt에 1 부터 9까지 출력한다.
			
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			
			fos.close();	// 12345
//			bos.close();	// 123456789
			
			/**
			 * 기반스트림의 close()를 호출해 주어야 버퍼에 남아있던 모든 내용이 출력된다!
			 */
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
