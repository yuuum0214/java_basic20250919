package oop.poly.car;

public class Tesla extends Car{

    @Override
    public void run() {
        System.out.println("테슬라가 달립니다~");
    }

    //다형성 중 이런 일을 하면 문제가 생길 수 있음.
    public void activeAutoPilot() {
        System.out.println("테슬라의 오토파일럿을 동작시킵니다!");
    }
}
