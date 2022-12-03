package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "60#D|70#C|80<B|90#A";	
		
		/*
		 * 패턴의 구분자로 #과 < 두가지를 제공하는데
		 * limit#value의 형태로 사용
		 * #은 경계값을 포함하지만 <는 포함하지 않음
		 * */
		
		int[] scores = {91,90,80,88,70,52,60};
		
		ChoiceFormat cf = new ChoiceFormat(pattern);
		
		for(int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]+" : "+cf.format(scores[i]));
		}
	}

}
