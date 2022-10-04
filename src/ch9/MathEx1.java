package ch9;

public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double val = 90.7552;
		System.out.println("round("+val+")="+Math.round(val));
		
		val *= 100;
		System.out.println("round("+val+")="+Math.round(val));
		
		System.out.println("round("+val+")/100="+Math.round(val)/100);
		System.out.println("round("+val+")/100.0="+Math.round(val)/100.0);
		
	}

}
