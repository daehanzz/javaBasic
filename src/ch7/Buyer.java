package ch7;

import java.util.Vector;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
//	Product[] item = new Product[10];	// 구입한 제품을 저장하기 위한 배열
//	int i = 0;		// Product 배열에 사용될 카운터
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		item[i++] = p;
		item.add(p);

		System.out.println(p+"을 구매하였습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {	// 구입한 제품을 Vector에서 제거
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+" 반품");
		}else {
			System.out.println("해당제품은 구입한 제품이 아닙니다");
		}
	}
	
	void summary() {
		int sum = 0;		// 구입한 물품의 가격합계
		String itemList="";	// 구입한 물품목록
		
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
		for(int i=0;i<item.size();i++) {
			Product p = (Product)item.get(i);	// Vector i번째에 있는 객체를 얻어온다
			sum += p.price;
			itemList += (i==0)?""+p:","+p;
		}
		
		System.out.println("총 가격 : "+sum);
		System.out.println("구입한 물품 목록 : "+itemList);
	}
	
	

}
