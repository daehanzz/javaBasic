package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] cArr = new char[0];		// char[] cArr = {};와 같다.
		String s = new String(cArr);	// String s = new String("");와 같다.
		
		System.out.println("cArr.lenght = "+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}

}
