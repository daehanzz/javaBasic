package ch13;

public class ThreadWaitEx4 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burgur"), "CUST2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
