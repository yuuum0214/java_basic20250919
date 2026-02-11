package etc.async;

public class Inventory {

    private int milk = 10;

    // 한 번에 한 스레드만 이 메서드를 실행할 수 있습니다.
    // 다른 스레드는 기다려야 합니다.
    public synchronized boolean useMilk() {
        System.out.println("[" + Thread.currentThread().getName() + "] 우유 확인 - 현재: " + milk + "개");

//        synchronized (this) {} -> 꼭 필요한 부분만 동기화
//        아래 로직을 전부 이 블럭으로 묶어서 처리할수도 있음.
        if(milk > 0){
            System.out.println("[" + Thread.currentThread().getName() + "] 우유 사용 시도...");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            milk--;

            System.out.println("[" + Thread.currentThread().getName() + "] 우유 사용 완료 - 남은 우유: " + milk + "개");
            return true;
        } else {
            System.out.println("[" + Thread.currentThread().getName() + "] 우유 부족!");
            return false;
        }
    }

    public int getMilk() {
        return milk;
    }
}
