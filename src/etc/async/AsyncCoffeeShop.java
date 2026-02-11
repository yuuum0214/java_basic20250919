package etc.async;

public class AsyncCoffeeShop {

    public Coffee makeCoffee(String coffeeName, String customerName) {
        System.out.println("{" + customerName + "}" + coffeeName + "제조 시작!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Coffee(coffeeName, customerName);
    }

    public static void main(String[] args) throws InterruptedException {

        AsyncCoffeeShop shop = new AsyncCoffeeShop();

        System.out.println("=== 커피숍 영업 시작 ===\n");
        long startTime = System.currentTimeMillis();

        // 각 주문을 별도의 스레드로 생성
        Thread thread1 = new Thread(() -> {
            shop.makeCoffee("아메리카노", "손님1");
        });

        Thread thread2 = new Thread(() -> {
            shop.makeCoffee("카페라떼", "손님2");
        });

        Thread thread3 = new Thread(() -> {
            shop.makeCoffee("바닐라라떼", "손님3");
        });

        // 모든 스레드 시작
        thread1.start();
        thread2.start();
        thread3.start();

        // 모든 스레드가 끝날 때까지 대기
        thread1.join();
        thread2.join();
        thread3.join();


        long endTime = System.currentTimeMillis();
        System.out.println("\n=== 모든 주문 완료 ===");
        System.out.println("총 소요시간: " + (endTime - startTime) / 1000 + "초");
    }

}
