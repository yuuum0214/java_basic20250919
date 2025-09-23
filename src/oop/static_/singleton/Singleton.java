package oop.static_.singleton;

public class Singleton {

    //외부에서 객체를 생성하지 못하도록 만듦
    //1. 외부에서 이 클래스의 객체를 생성하지 못하도록
    //생성자를 단 하나만 선언하고, 그것을 private으로 가려버림
    private Singleton() {
        System.out.println("객체가 생성됨!");
    }

    //2. 생성자를 호출할 수 있는 곳 -> 같은 클래스 내부 뿐
    // 스스로의 객체를 단 1개만 생성
    private static Singleton s = new Singleton();

    //3. 외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은
    // 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
    public static Singleton getInstance() {
        //getInstance 라고 쓰는 건 약간 관례. 암묵적인 룰임.
        return s; //Singleton의 주소를 알려줄게 찾아가렴
    }

    public void method1() {
        System.out.println("여러 클래스에서 사용하는 중요한 메서드");
    }

    public void method2() {
        System.out.println("프로그램 내에서 최소 한 번씩은 호출해야 하는 필수 메서드!");
    }

}
