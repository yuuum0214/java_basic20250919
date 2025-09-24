package oop.solid.lsp;

public class Main {

    public static void testArea(Shape r) {

        // 만약 메서드에서 두 도형이 모두 필요하다면 매개변수의 타입을 Shape으로
        // Rectangle은 Rectangle 전용 메서드로 유효성 판단을 하고
        // Square는 Square 전용 메서드로 유효성을 판단함.
//        if(r.getArea() != 50) {
//            System.out.println("계산 오류! 기대값: 50, 실제값: " + r.getArea());
//        } else {
//            System.out.println("계산 정상!");
//        }
    }

    public static void main(String[] args) {

        testArea(new Rectangle(10, 5));
        testArea(new Square(10));

    }

}
