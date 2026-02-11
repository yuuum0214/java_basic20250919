package etc.async.future;

import java.util.concurrent.*;

public class MultipleFuturesDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();

        Future<String> future1 = executor.submit(() -> {
            System.out.println("커피 제조 중...");
            Thread.sleep(2000);
            return "☕아메리카노";
        });

        Future<String> future2 = executor.submit(() -> {
            System.out.println("커피 제조 중...");
            Thread.sleep(3000);
            return "☕카페라떼";
        });

        Future<String> future3 = executor.submit(() -> {
            System.out.println("커피 제조 중...");
            Thread.sleep(2500);
            return "☕바닐라라떼";
        });

        Future<String> future4 = executor.submit(() -> {
            System.out.println("커피 제조 중...");
            Thread.sleep(10000);
            return "☕아인슈페너";
        });

        System.out.println("3잔 모두 주문 완료! 기다리는 중...\n");

        String coffee1 = future1.get();
        String coffee2 = future2.get();
        String coffee3 = future3.get();

        try {
            String coffee4 = future4.get(5, TimeUnit.SECONDS);
            System.out.println("받음: " + coffee4);
        } catch (TimeoutException e) {
            System.out.println("너무 오래 걸려요! 취소합니다.");
            future4.cancel(true); // 취소
        }

        long end = System.currentTimeMillis();

        System.out.println("=== 모든 커피 완성 ===");
        System.out.println("coffee1 = " + coffee1);
        System.out.println("coffee2 = " + coffee2);
        System.out.println("coffee3 = " + coffee3);
        System.out.println("\n총 소요시간: " + (end - start) / 1000 + "초");
    }

}
