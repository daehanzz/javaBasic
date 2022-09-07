package variable;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);	//scanner 클래스의 객체를 생성
		
		System.out.println("두자리 정수를 하나 입력해주세요 : ");
		
		String input = sc.nextLine();	//입력받은 내용을 input에 저장
		int num = Integer.parseInt(input);	//입력받은 내용을 int타입의 값으로 변환
		
		System.out.println("입력 내용 : "+input);
		System.out.printf("num : %d%n", num);
		
	}

}
