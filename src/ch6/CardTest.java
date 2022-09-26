package ch6;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
 
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
 
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
 
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        
        // width와 height는 static 변수이므로 c1.width c1.height로 값을 변경 했지만, 그 클래스로부터 만들어진 모든 인스턴스의 height, width속성이 변한다.
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;
 
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
 
    }
}
 
