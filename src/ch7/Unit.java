package ch7;

public class Unit {

	int currentHP;	// 유닛의 체력
	int x;			// 유닛의 위치 x좌표
	int y;			// 유닛의 위치 y좌표
	
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}
