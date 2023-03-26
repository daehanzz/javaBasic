package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileInputStream  fis = new FileInputStream(args[0]);
//		FileOutputStream fos = new FileOutputStream(args[1]);
		
		// 텍스트 파일을 다루는 경우에는 FileInputStream,FileOutputStream보다 아래처럼 사용하는 것이 더 좋다 
		FileReader fis = new FileReader(args[0]);
		FileWriter fos = new FileWriter(args[1]);
		
		int data = 0;
		while ((data = fis.read()) != -1) {
			fos.write(data);;
		}
		
		fis.close();
		fos.close();
	}

}
