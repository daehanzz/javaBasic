package ch7;

public class Point3D extends Point {
	int z=30;
	
	Point3D(){
		this(100,200,300);
	}
	
	Point3D(int x, int y,int z){
		
        // 컴파일러는 이곳에 조상클래스의 생성자를 호출하는 명령어가 없으므로 super();를 자동으로 삽입해줌.
        // 그래서 조상클래스의 생성자인 'Point();'가 불려오지만 해당 생성자는 존재하지 않으므로 에러가 발생한다
        // 해결방법은 ...?
        // 1) Point 클래스(조상클래스)에 생성자 'Point();'를 추가해준다.
        // 2) 조상클래스의 생성자 호출시 'super();'가 아닌 'super(x,y);'로 호출한다.
        // => 즉 조상 클래스의 멤버변수(x와 y)는 이처럼 조상의 생성자에 의해서 초기화 되도록 해야 한다.

		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {	// 오버라이딩
		return "x : "+x+", y : "+y+", z : "+z;
	}

}
