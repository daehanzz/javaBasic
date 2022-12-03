package ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tableName = "CUST_INFO";
		String msg = "INSERT INTO "+tableName+" VALUES (''{0}'',''{1}'',''{2}'',''{3}'')";
		
		Object[][] arguments = {
				{"이자바","02-123-4567","27","07-09"},{"홍대한","010-2419-0040","29","07-19"}
		};
		
		for(int i = 0; i<arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
