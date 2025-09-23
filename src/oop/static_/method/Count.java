package oop.static_.method;

public class Count {

    public int a;
    public static int b;

    //인스턴스 메서드 : 객체별로 따로따로 행동하는 기능 -> 호출 시 객체 생성 필수
    public void m1() {
        System.out.println("instance method called!");
        System.out.println(a);
        System.out.println(b);
    }

    //스태틱 메서드 : 정적, 공유 기능, 객체가 필요 없음.
    public static void m2() {
        System.out.println("instance method called!");
//        System.out.println(this); -> static 메서드는 객체 생성 없이 호출 가능. this가 띨 주소가 없음.
//        System.out.println(a); -> a는 인스턴스 필드,. 객체가 생성되어야 생기는 필드.

        System.out.println(b);
//        m1(); -> 얘도 객체가 생성되어야지만 만들어지는 기능.

    }
}
