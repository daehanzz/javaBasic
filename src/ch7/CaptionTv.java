package ch7;

public class CaptionTv extends Tv {
	
	boolean caption;	// 캡션상태 on/off
	
	void displayCaption(String text) {
		if(caption) {	// 캡션상태가 on 일때만 text를 보여준다
			System.out.println(text);
		}
	}
}
