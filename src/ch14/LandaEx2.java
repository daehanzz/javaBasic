package ch14;

public class LandaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; // MyFunction f = (MyFunction)(() -> {});
        Object obj = (MyFunction)(() -> {});    // Object 타입으로 형변환이 생략
        String str = ((Object)(MyFunction)()->{}).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        // System.out.println(() -> {});   // 에러. 람다식은 Object 타입으로 형변환 안됨
        System.out.println((MyFunction)(() -> {}));
        // System.out.println((MyFunction)(() -> {}).toString());  // 에러
        System.out.println(((Object)(MyFunction)() -> {}).toString());
    }
}

@FunctionalInterface
interface MyFunction {
    public abstract void myMethod();
}
