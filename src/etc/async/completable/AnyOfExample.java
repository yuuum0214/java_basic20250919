package etc.async.completable;

import java.util.concurrent.CompletableFuture;

public class AnyOfExample {

    public static void main(String[] args) {

        System.out.println("=== 가장 빨리 나오는 커피 찾기 시작! ===\n");
        long start = System.currentTimeMillis();

        CompletableFuture<String> starbucks = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[스타벅스] 커피 완성! (2초)");
            return "starbucks";
        });

        CompletableFuture<String> twosome = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[투썸] 커피 완성! (1초)");
            return "twosome";
        });

        CompletableFuture<String> compose = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[컴포즈] 커피 완성! (3초)");
            return "compose";
        });

        // anyOf: 셋 중 하나라도 끝나면 즉시 결과를 리턴
        CompletableFuture<Object> winnerFuture = CompletableFuture.anyOf(starbucks, twosome, compose);

        // 결과 꺼내기 (다른 스레드 기다리지 않음!)
        Object winner = winnerFuture.join();

        long end = System.currentTimeMillis();
        System.out.println("winner = " + winner);
        System.out.println("메인 스레드 대기 시간: " + (end - start) / 1000 + "초");
        System.out.println("메인 스레드는 이제 끝났습니다.");

        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
