package ch5;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<100;i++) {
			int rnd = (int)(Math.random()*10);
			int tmp = numArr[0];
			
			numArr[0] = numArr[rnd];
			numArr[rnd] = tmp;
		}
		
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]);
		}
	}

}
