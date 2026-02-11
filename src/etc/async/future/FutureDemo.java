package etc.async.future;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        System.out.println("=== 커피 주문 ===\n");

        Callable<String> task = () -> {
            System.out.println("커피 제조 중...");
            Thread.sleep(3000);
            return "☕아메리카노";
        };

        Future<String> future = executor.submit(task);

        System.out.println("주문 완료! 다른 일 하는 중...");
        System.out.println("메뉴판 구경...");
        System.out.println("핸드폰 확인....");

        String coffee = future.get();
        System.out.println("\n 받은 커피: " + coffee);

        executor.shutdown();

    }

}
