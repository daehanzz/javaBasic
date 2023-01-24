package ch13;

public class ThreadEx21 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        // 메서드에 synchronized를 붙이지 않고 
        // synchronized(this) {} 메서드 내 영역을 묶어주는 방법도 있음
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }

            balance -= money;
        }
    }// withdraw()
}

class RunnableEx21 implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300 중의 한 값을 임의로 선택해서 출금(widthdraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);

            System.out.println("balance : "+acc.getBalance());
        }
    } // run()
}
