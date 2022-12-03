package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 "+pattern+ "의 형태로 입력해주세요.(입력예 : 2015/01/01)");
		
		while (sc.hasNextLine()) {	// .hasNextLine() : 다음줄의 입력여부 판단 있으면 True, 없으면 False 
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("날짜를 "+pattern+ "의 형태로 다시 입력해주세요.(입력예 : 2015/01/01)");
			}
		} // while 끝
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis());
		
		System.out.println("입력하신 날짜는 현재와 "+day+"시간 차이가 있습니다");
	}

}
