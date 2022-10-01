package ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception e = new Exception("고의로 발생 시켰음");
			throw e;
			
//			throw new Exception("고의로 발생 시켰음");	// 위 두줄을 한줄로 줄여쓸 수 있음
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료되었음");
	}

}
