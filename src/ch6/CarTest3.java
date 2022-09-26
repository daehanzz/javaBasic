package ch6;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
        
        c1.door = 100;
        System.out.println("c1.door = 100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}
