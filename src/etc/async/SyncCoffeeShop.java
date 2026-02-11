package etc.async;

public class SyncCoffeeShop {

    public Coffee makeCoffee(String coffeeName, String customerName){
        System.out.println("{" + customerName + "}" + coffeeName + "제조 시작!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Coffee(coffeeName, customerName);
    }

    public static void main(String[] args){

        SyncCoffeeShop shop = new SyncCoffeeShop();

        System.out.println("=== 커피숍 영업 시작 ===\n");
        long startTime = System.currentTimeMillis();

        Coffee coffee1 = shop.makeCoffee("아메리카노", "손님1");
        Coffee coffee2 = shop.makeCoffee("카페라떼", "손님2");
        Coffee coffee3 = shop.makeCoffee("바닐라라떼", "손님3");

        long endTime = System.currentTimeMillis();
        System.out.println("\n=== 모든 주문 완료 ===");
        System.out.println("총 소요시간: " + (endTime - startTime) / 1000 + "초");
    }

}
