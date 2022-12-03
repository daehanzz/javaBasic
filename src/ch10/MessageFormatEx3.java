package ch10;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatEx3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String[] data = {
				"INSERT INTO CUST_INFO VALUES ('이자바','02-123-4567','27','07-09')",
				"INSERT INTO CUST_INFO VALUES ('홍대한','010-2419-0040','29','07-19')"
		};
		
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3})";
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i=0; i<data.length; i++) {
			Object[] obj = mf.parse(data[i]);
			for(int j = 0; j<obj.length;j++) {
				System.out.print(obj[j]+" , ");
			}
			System.out.println();
		}
	}

}
