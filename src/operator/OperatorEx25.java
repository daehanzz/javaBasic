package operator;

import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("문자를 하나 입력하세요 : ");
		
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		if('0'<=ch&&ch<='9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		else if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}
