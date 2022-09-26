package ch7;

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("캡션 true일 때 보이는 메세지1");
		ctv.caption = true;
		ctv.displayCaption("캡션 true일 때 보이는 메세지2");
	}

}
