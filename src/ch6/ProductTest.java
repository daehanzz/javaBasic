package ch6;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serialNo)는 "+p1.serialNo);
		System.out.println("p2의 제품번호(serialNo)는 "+p2.serialNo);
		System.out.println("p3의 제품번호(serialNo)는 "+p3.serialNo);
		System.out.println(Product.count);
	}

}

class Product {
	static int count = 0;
	int serialNo;
	
	{	/*
		Product 인스턴스가 생성될 때마다 count의 
		값을 1씩 증가시켜서 serialNo에 저장한다
	*/
		++count;
		serialNo = count;
	}	
	
}