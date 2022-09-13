package operator;

public class OperatorEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 +0.5)/1000.0;	//반올림을 위해 0.5 더함 
														//Math.round 메서드를 통해서도 가능
		
		System.out.println(shortPi);
	}

}
