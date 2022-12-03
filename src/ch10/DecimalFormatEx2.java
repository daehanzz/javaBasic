package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df1.parse("1,234,567.89");
			System.out.printf("1,234,567.89"+" -> ");
			
			double d = num.doubleValue();
			System.out.print(d+" -> ");
			
			System.out.println(df2.format(num));
		} catch (Exception e) {

		}
		
	}

}
