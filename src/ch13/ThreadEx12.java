package ch13;

public class ThreadEx12 {
    
    public static void main(String[] args) {
        Threadex12_1 th1 = new Threadex12_1();
        Threadex12_2 th2 = new Threadex12_2();

        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        System.out.println("<< main 종료 >>");
    }
}

class Threadex12_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("-");
        }

        System.out.println("<< th1 종료 >>");
    }
}

class Threadex12_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("|");
        }

    System.out.println("<< th2 종료 >>");
    }
}
