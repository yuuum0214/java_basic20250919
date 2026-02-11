package etc.async;

public class Barista implements Runnable {

    private String name;
    private Inventory inventory;
    private int targetCount;

    public Barista(String name, Inventory inventory, int targetCount) {
        this.name = name;
        this.inventory = inventory;
        this.targetCount = targetCount;
    }

    @Override
    public void run() {
        int successCount = 0;

        for(int i=1; i <= targetCount; i++){
            boolean success = inventory.useMilk();
            if(success){
                successCount++;
                System.out.println(">>> ☕ [" + name + "] 라떼 " + i + "번 완성! ");
            } else{
                System.out.println(">>> [" + name + "] 라떼 " + i + "번 실패 (우유 부족)");
            }

            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n { " +name + " } 최종 결과: " + successCount + "잔 성공, " + (targetCount-successCount) + "잔 실패!\n");
    }
}
