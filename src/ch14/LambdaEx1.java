package ch14;

public class LambdaEx1 {
    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction1 f1 = () -> System.out.println("f1.run()");

        MyFunction1 f2 = new MyFunction1() { // 익명클래스로 run()을 구현
                            public void run() { // public 을 반드시 붙여야함
                                System.out.println("f2.run()");
                            }
                        };

        MyFunction1 f3 = getMyFunction();
        
        f1.run();
        f2.run();
        f3.run();
        
        excute(f1);
        excute( () ->System.out.println("run()") );

    }
    
    static void excute(MyFunction1 f){
        f.run();
    }

    static MyFunction1 getMyFunction() {
        // MyFunction f = () -> System.out.println("f3.run()");
        // return f;

        return ()->System.out.println("f3.run()");
    }
}

@FunctionalInterface
interface MyFunction1 {
    void run();
}
