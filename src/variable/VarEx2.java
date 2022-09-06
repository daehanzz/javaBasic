package variable;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//두 변수의 값 교환
		int x=10,y=20;
		int tmp=0;	//임시 저장소로 사용할 변수 선언
		
		System.out.println("x : "+x+", y : "+y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x : "+x+", y : "+y);
	}

}
