package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			FileWriter fw = new FileWriter("test.txt");
			
			fw.write("Hello, 안녕하세요?");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			// FileInputStream을 이용해서 파일내용을 읽어 화면에 출력
			while ((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			// FileReader를 이용해서 파일내용을 읽어 화면에 출력
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
