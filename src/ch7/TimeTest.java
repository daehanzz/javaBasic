package ch7;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time(12, 35, 30);
		System.out.println(t);
		
//		t.hour = 1;	// 에러. 변수 hour의 접근제한자가 private이기 때문에
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}

}
