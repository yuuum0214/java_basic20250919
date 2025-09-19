package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {

        //30-100 사이의 소수가 몇 개 있는지 세어보자! (for)
        int total = 0;
        for(int i = 30; i<=100; i++){
            int count = 0;
            for (int j=1; j<=i; j++){
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2){
                total++;
            }
        }
        System.out.println("total = " + total);
    }
}
