package ch9;

import java.math.BigInteger;

public class BigIntegerEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1; i<100; i++){ //1!부터 99!까지 출력
			System.out.printf("%d!=%s%n",i,calcFactorial(i));
			//Thread.sleep(300); //0.3초의 지연
		}

	}
	
	static String calcFactorial(int n){
		return factorial(BigInteger.valueOf(n)).toString();
	}
	
	static BigInteger factorial(BigInteger n){
		if(n.equals(BigInteger.ZERO)) // 0일경우
			return BigInteger.ONE;  //1을 반환
		else //return n* fatorial(n-1);
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}