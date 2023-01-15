package ch13;

import javax.swing.JOptionPane;

public class ThreadEx13 {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 "+input+"입니다.");
        th1.interrupt();
        System.out.println("isInterrupted() : "+th1.isInterrupted());   // true
    }
}

class ThreadEx13_1 extends Thread {
    @Override
    public void run() {
        int i=10;

        while (i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for (long j = 0; j < 25000000000000000L; j++) ;    // 시간지연
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}
