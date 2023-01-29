package ch13;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws Exception {
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "Cook1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(100); // 0.1초(100 밀리 세컨드) 후에 강제 종료시킨다.
        System.exit(0);
    }
}

// 손님 class
class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try { Thread.sleep(10); } catch(InterruptedException e) {}
            String name = Thread.currentThread().getName();

            if(eatFood())
                System.out.println(name + " ate a "+food);
            else
                System.out.println(name + " failed to eat. : (");
        } // while
    }

    boolean eatFood() { return table.remove(food); }
}

// 요리사 class
class Cook implements Runnable {
    private Table table;

    Cook(Table table) { this.table = table; }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 하나 선택해서 table에 추가한다.
            int idx = (int)(Math.random() * table.dishNum());

            table.add(table.dishNames[idx]);

            try { Thread.sleep(100); } catch(InterruptedException e) {}
        } // while
    }
}

// Table class
class Table {
    String[] dishNames = {"donut","donut","burger"}; // donut이 더 자주 나온다.
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();

    public void add(String dish) {

        lock.lock();

        try{
        // 테이블에 음식이 가득차면, 테이블에 음식을 추가하지 않는다.
        while(dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                forCook.await(); // Cook 쓰레드를 기다리게함
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        
            dishes.add(dish);
            forCust.signal();   // 기다리고 있는 CUST를 깨움
            System.out.println("Dishes : "+dishes.toString());
    } finally {
        lock.unlock();
    }
    }


    public boolean remove(String dishName) {
        lock.lock();
        String name = Thread.currentThread().getName();

        try{
        while (dishes.size()==0) {
            System.out.println(name + " is waiting.");
            try {
                forCust.await(); // CUST쓰레드를 기다리게함
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }
        
        while (true) {
            for (int index = 0; index < dishes.size(); index++) {
                if(dishName.equals(dishes.get(index))) {
                    dishes.remove(index);
                    forCook.signal();
                    return true;
                }
            }

            try {
                System.out.println(name + " is waiting.");
                forCust.await();
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        // 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
    }finally {
        lock.unlock();
    }

    }

    public int dishNum() { return dishNames.length; }
}
