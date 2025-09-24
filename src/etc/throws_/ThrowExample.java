package etc.throws_;

public class ThrowExample {

    static int calcTotal(int end) throws Exception{
        if (end <= 0){
            throw new ArithmeticException("매개값은 양수로 주세요!");
        }

        int total = 0;
        for (int i=1; i<=end; i++){
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            int result1 = calcTotal(100);
            System.out.println("result1 = " + result1);

            int result2 = calcTotal(-120);
            System.out.println("result2 = " + result2);
        } catch (Exception e) {
            System.out.println("catch문 실행!");
        }
        System.out.println("프로그램 정상 종료!");
    }
}
