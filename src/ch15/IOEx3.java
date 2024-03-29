package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];	// IOEx2와 배열의 크기가 다름.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		
		try {
			while (input.available() > 0) {
				input.read(temp);
				output.write(temp);
//				System.out.println("temp : "+Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc); // Output Source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7]
			}
		} catch (IOException e) {
		}

	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : "+Arrays.toString(temp));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
	}

}
