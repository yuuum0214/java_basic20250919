package etc.async.completable;

import java.util.concurrent.CompletableFuture;

public class CoffeeOrderProcess {

    public static void main(String[] args) {

        System.out.println("=== 커피 주문 프로세스 ===\n");

        CompletableFuture.supplyAsync(() -> {
            System.out.println("1. 주문 접수");
            sleep(500);
            return "아메리카노";
        })
                .thenApply(menu -> {
                        System.out.println("2. 가격 계산: " + menu);
                        sleep(300);
                        return new Order(menu, 4500);
                })
                .thenApply(order -> {
                    System.out.println("3. 결제 처리: " + order.price + "원");
                    sleep(700);
                    order.paid = true;
                    return order;
                })
                .thenApply(order -> {
                    System.out.println("4. 커피 제조 중: " + order.menu);
                    sleep(2000);
                    order.ready = true;
                    return order;
                })
                .thenAccept(order -> {
                    System.out.println("5. 주문 완료!");
                    System.out.println("메뉴: " + order.menu);
                    System.out.println("가격: " + order.price);
                    System.out.println("준비 완료!");
                })
                .join(); // 모든 과정이 끝날 때까지 대기

    }

    static class Order {
        String menu;
        int price;
        boolean paid = false;
        boolean ready = false;

        Order(String menu, int price) {
            this.menu = menu;
            this.price = price;
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
