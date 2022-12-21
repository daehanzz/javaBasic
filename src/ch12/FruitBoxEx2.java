package ch12;

import java.util.Comparator;

class Fruit implements Eatable{
    String name;
    int weight;

    Fruit() {}

    Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){ return name+"("+weight+")"; }
}

class Apple extends Fruit {

    Apple(){}
    Apple(String name,int weight){
        super(name, weight);
    }
}

class Grape extends Fruit {
    Grape(){}
    Grape(String name, int weight){
        super(name, weight);
    }
}

class Toy {public String toString(){ return "Toy";}}

class AppleComp implements Comparator<Apple> {
    public int compare(Apple t1, Apple t2){
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape> {
    public int compare(Grape t1, Grape t2){
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2){
        return t1.weight - t2.weight;
    }
}


interface Eatable{}
public class FruitBoxEx2 {
    
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>();    // 에러. 타입 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>();          // 에러.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape());   // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);

    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}