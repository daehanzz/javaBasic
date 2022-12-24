package ch12;

public abstract class MyTransportation extends MyEnum {
    
    static final MyTransportation BUS = new MyTransportation("BUS",100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIND",100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    };
    static final MyTransportation SHIP = new MyTransportation("SHIP",100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    };
    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE",100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    };

    abstract int fare(int distance);    // 추상 메서드

    protected final int BASIC_FARE;

    private MyTransportation(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {return name;}
    public String toString() {return name;}
}
