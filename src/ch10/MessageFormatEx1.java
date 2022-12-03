package ch10;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "Name : {0} \nTel : {1} \nAge : {2} \nBirthDay : {3}";
		
		Object[] arguments = {
			"이자바", "02-123-1234", "27", "09-07"
		};
		
		String result = MessageFormat.format(msg, arguments);
		
		System.out.println(result);
	}

}
