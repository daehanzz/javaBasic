package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		
		System.out.print("숫자를 하나 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();	// 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);	// tmp 값을 숫자로 변환
		
		if(input==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		if(input!=0) {
			System.out.println("입력한 숫자는 0이 아닙니다.");
			System.out.println("입력한 숫자는 "+input+"입니다.");
		}
	}

}
