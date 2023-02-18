package ch14;

public class LamdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) {
            int val = 30;
            // i = 10; // 에러. 람다식내에서 참조하는 지역변수는 final이 붙지 않아도 상수로 간주되어 값변경불가 

            // MyFunction2 f = (i) -> {    // 에러. 외부 지역변수와 같은 이름의 람다식 매개변수는 허용 X
            MyFunction2 f = () -> {
                System.out.println("i : " + i);
                System.out.println("val : " + val);
                System.out.println("this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };

            f.myMethod();
        }
    }
}
