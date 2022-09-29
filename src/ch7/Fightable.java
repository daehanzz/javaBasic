package ch7;

interface Fightable extends Movable,Attackable {

}

interface Movable{
	void move(int x,int y);
}

interface Attackable{
	void attack(Unit u);
}

