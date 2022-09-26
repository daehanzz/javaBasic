package ch6;

public class Car2 {

	String color;
	String gearType;
	int door;
	
	Car2(){
		this("while","auto",4);
	}
	
	Car2(String c){
		this(c,"auto",4);
	}
	
	Car2(String c,String g,int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}
