package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method1()은 static 메서드이므로 인스턴스 생성없이 직접 호출이 가능하다.
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");

	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다");
			return;		// 현재 실행 중인 메서드를 종료한다
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// try블럭에서 return문이 실행돼도 finally 블럭은 실행이 된다
			System.out.println("method1()의 finally 블럭이 실행되었습니다");
		}
	}

}
