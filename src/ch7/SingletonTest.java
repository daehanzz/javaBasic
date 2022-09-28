package ch7;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Singleton s = new Singleton(); 에러
        Singleton s = Singleton.getInstance(); // 함수를 통해서만 인스턴스를 생성 할 수 있다.

	}

}

final class Singleton {
    private static Singleton s = new Singleton();
 
    // 생성자
    // 생성자의 접근제어자가 private로 설정되어 있으므로 외부에서 생성자에게 접근이 불가능하다.
    // => 그러므로 인스턴스 생성이 불가능하다.
    private Singleton() {
        // ....
    }
 
    //클래스 내부에서 인스턴스를 생성하여 getInstance() 함수를 통해 외부에서 이 인스턴스를 사용할 수 있다.
    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
 
 
}
