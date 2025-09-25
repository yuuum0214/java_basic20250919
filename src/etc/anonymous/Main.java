package etc.anonymous;

public class Main {
    public static void main(String[] args) {

        Calculator cal;
        cal = new AddCalculator();
        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        //익명 클래스 ( 인터페이스의 구현체를 즉석 선언 후 사용)
        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 - n2;
            }
        };

        int r2 = cal.operate(50 ,27);
        System.out.println("r2 = " + r2);

        // 선언하자마자 메서드 호출하고 끝! (객체 더이상 지목 안됨!)
        int r3 = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }.operate(20, 4);
        System.out.println("r3 = " + r3);

        // 람다 (1.8 이상부터 사용 가능)
        // 사용 전제 조건
        // -> 반드시 인터페이스 안에 추상메서드가 1개여야 한다!

        cal = ((n1, n2) -> n1 / n2 );
        int r4 = cal.operate(27, 6);
        System.out.println("r4 = " + r4);

        cal = (n1, n2) -> {
            System.out.println("람다식 여러 줄 쓰기~");
            return n1 % n2;
        };
        int r5 = cal.operate(67, 8);
        System.out.println("r5 = " + r5);
    }
}
