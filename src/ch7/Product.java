package ch7;

public class Product {

	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product(){
		// 기본 생성자
		price = 0;
		bonusPoint = 0;
	}
}
