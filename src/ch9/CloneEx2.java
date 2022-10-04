package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();	// 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다
		
		/*
		 * 위 두줄과 같음
		 * */
//		int[] arr = {1,2,3,4,5};
//		int[] arrClone = new int[arr.length];
//		System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		arrClone[0]=6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
