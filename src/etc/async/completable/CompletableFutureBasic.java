package etc.async.completable;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureBasic {

    public static void main(String[] args) {

        System.out.println("=== CompletableFuture 기본 ===\n");

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("커피 제조 중... (" + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "☕ 아메리카노";
        });

        System.out.println("주문 완료! 다른 일 하는 중...");

        String coffee = future.join(); // get과 비슷하지만 예외처리를 가용하진 않음(unchecked exception)
        System.out.println("받음: " + coffee);
    }

}
