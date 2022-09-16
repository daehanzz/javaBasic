package ch4;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("숫자를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	// 입력받은 숫자를 input에 저장
		
		if(input==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}else {
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
	}

}
