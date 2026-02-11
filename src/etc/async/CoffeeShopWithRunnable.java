package etc.async;

public class CoffeeShopWithRunnable {

    static class CoffeeMaker implements Runnable {

        private String coffeeName;
        private String customerName;

        public CoffeeMaker(String coffeeName, String customerName) {
            this.coffeeName = coffeeName;
            this.customerName = customerName;
        }

        @Override
        public void run() {
            String baristaName = Thread.currentThread().getName();
            System.out.println("[baristaName = " + baristaName + "]");
            System.out.println("{" + customerName + "}" + coffeeName + "제조 시작!");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + customerName + "]" + coffeeName + " 제조 완료!");
        }
    }

//    public Coffee makeCoffee(String coffeeName, String customerName) {
//        System.out.println("{" + customerName + "}" + coffeeName + "제조 시작!");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return new Coffee(coffeeName, customerName);
//    }

    public static void main(String[] args) throws InterruptedException {

        CoffeeShopWithRunnable shop = new CoffeeShopWithRunnable();

        System.out.println("=== 커피숍 영업 시작 ===\n");
        long startTime = System.currentTimeMillis();

        // 각 주문을 별도의 스레드로 생성
        Thread thread1 = new Thread(new CoffeeMaker("아메리카노", "손님1"));
        Thread thread2 = new Thread(new CoffeeMaker("카페라떼", "손님2"));
        Thread thread3 = new Thread(new CoffeeMaker("바닐라라떼", "손님3"));

        // 스레드 이름 설정
        thread1.setName("바리스타-1");
        thread2.setName("바리스타-2");
        thread3.setName("바리스타-3");

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
