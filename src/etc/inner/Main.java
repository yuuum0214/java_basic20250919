package etc.inner;

import oop.static_.utils.PrintUtil;

public class Main {
    public static void main(String[] args) {

        // 1. 인스턴스 내부 클래스 사용하기
        // 반드시 바깥 클래스의 객체가 먼저 필요합니다.
        Car myCar = new Car(50);
        Car.Engine myEngine = myCar.new Engine();
        myEngine.start();

        PrintUtil.printLine();

        Car.TireSpec tireSpec = new Car.TireSpec();
        tireSpec.printInfo();

        PrintUtil.printLine();

        myCar.drive(440);

    }
}
