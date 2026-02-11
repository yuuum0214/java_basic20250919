package etc.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        // 10개의 스레드로 구성된 풀 생성
        // Executor.newCachedThreadPool : 일반적으로는 Fixed를 많이 씀
        //  SingleThread 단일 스레드만 사용
        ExecutorService executor = Executors.newFixedThreadPool(10);

        System.out.println("=== 커피숍 영업 시작! (손님 100명) ===");
        long start = System.currentTimeMillis();

        for(int i=1; i<=100; i++){
            final int orderNum = i;

            executor.submit(()->{
                System.out.println("[주문 " + orderNum + "] 처리 시작 - " + Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("[주문 " + orderNum + "] 완료!");
            });

        }

        // 스레드 풀 종료
        executor.shutdown();

        // 모든 작업 완료 대기
        try{
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("총 소요시간: " + (end-start) / 1000 + "초");

    }

}
