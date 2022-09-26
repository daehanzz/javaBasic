package ch6;

public class Car3 {

	String color;
	String gearType;
	int door;
	
	Car3(){
		this("while","auto",4);
	}
	
	Car3(Car3 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String c,String g,int d){
		this.color = c;
		this.gearType = g;
		this.door = d;
	}
}
	