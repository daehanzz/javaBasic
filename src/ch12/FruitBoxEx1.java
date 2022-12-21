package ch12;

import java.util.ArrayList;

public class FruitBoxEx1 {

    static class Grape extends Fruit { public String toString() { return "Grape";}}
    static class Fruit { public String toString(){ return "Fruit"; }}
    static class Apple extends Fruit { public String toString() { return "Apple";}}
    static class Toy { public String toString() { return "Toy";}}

    public static void main(String[] args) {
        Box<Fruit> fBox = new Box<>();
        Box<Apple> aBox = new Box<>();
        Box<Toy> tBox = new Box<>();
        // Box<Grape> gBox = new Box<Apple>();  // 에러. 타입 불일치

        fBox.add(new Fruit());
        fBox.add(new Apple());

        aBox.add(new Apple());
        aBox.add(new Apple());
        // aBox.add(new Toy());    에러. Box<Apple>에는 Apple만 담을 수 있음

        tBox.add(new Toy());
        // tBox.add(new Apple());   에러. Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fBox);
        System.out.println(aBox);
        System.out.println(tBox);

    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    ArrayList<T> getList(){ return list; }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
