package ch14;

public class LamdaEx1 {
    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 익명클래스로 run()을 구현
                            public void run() { // public 을 반드시 붙여야함
                                System.out.println("f2.run()");
                            }
                        };

        MyFunction f3 = getMyFunction();
        
        f1.run();
        f2.run();
        f3.run();

        excute(f1);
        excute( () ->System.out.println("run()") );

    }

    static void excute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction() {
        // MyFunction f = () -> System.out.println("f3.run()");
        // return f;

        return ()->System.out.println("f3.run()");
    }
}

@FunctionalInterface
interface MyFunction {
    void run();
}
