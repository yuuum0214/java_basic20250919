package etc.async;

public class RaceConditionDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 커피숍 재고 관리 시스템 ===\n");

        Inventory inventory = new Inventory();
        System.out.println("초기 우유: " + inventory.getMilk() + "개");

        Thread barista1 = new Thread(new Barista("바리스타-1", inventory, 5));
        Thread barista2 = new Thread(new Barista("바리스타-2", inventory, 5));
        Thread barista3 = new Thread(new Barista("바리스타-3", inventory, 5));

        barista1.start();
        barista2.start();
        barista3.start();

        barista1.join();
        barista2.join();
        barista3.join();

        System.out.println("===========================");
        System.out.println("최종 남은 우유: " + inventory.getMilk() + "개");
    }
}
