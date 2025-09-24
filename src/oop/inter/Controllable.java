package oop.inter;

public interface Controllable {

    // 인터페이스에 변수를 선언하면 상수(static final)로 인식함.
    int NUM = 5;

//    public Controllable(){
//      인터페이스는 생성자를 가질 수 없음 -> 객체화 될 수 없는 개념.
//    }

    // 인터페이스는 메서드를 선언하면 추상 메서드로 지정됨.
    void turnOn();

    void turnOff();

    void moveForward();

    void moveBackward();

}
