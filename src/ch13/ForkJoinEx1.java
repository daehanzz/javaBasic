package ch13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinEx1 {
    static final ForkJoinPool pool = new ForkJoinPool(); // 쓰레드 풀을 생성

    public static void main(String[] args) {
        long from = 1L, to = 100_000_000L;

        sumTask task = new sumTask(from, to);

        long start = System.currentTimeMillis(); // 시작시간 초기화
        Long result = pool.invoke(task);

        System.out.println("Elapsed time(4 core) : "+(System.currentTimeMillis()-start));

        System.out.printf("sum of %d ~ %d = %d%n",from,to,result);
        System.out.println();
        
        result = 0L;
        start = System.currentTimeMillis(); // 시작시간 초기화
        
        for(long i = from; i<=to; i++)
        result += i;
        
        System.out.println("Elapsed time(1 core) : "+(System.currentTimeMillis()-start));
        System.out.printf("sum of %d ~ %d = %d%n",from,to,result);
            
    }
}

class sumTask extends RecursiveTask<Long> {
    long from, to;

    sumTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long compute(){
        long size = to - from + 1; // from <= i <= to

        if(size <= 5) 
            return sum(); // 숫자의 합을 반환

        long half = (from + to) / 2;

        // 범위를 반으로 나눠서 두 개의 작업을 생성
        sumTask leftSum = new sumTask(from, half);
        sumTask rightSum = new sumTask(half + 1, to);

        leftSum.fork();

        return rightSum.compute() + leftSum.join();
    }

    long sum() {
        long tmp = 0L;

        for(long i=from;i<=to;i++)
            tmp += i;

        return tmp;
    }
}