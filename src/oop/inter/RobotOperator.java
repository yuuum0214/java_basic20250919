package oop.inter;

import oop.modi.cls.apc2.C;

public class RobotOperator {

    //인터페이스 구현 타입으로도 다형성 발생 가능
    public void testRobot(Controllable robot) {
        System.out.println("*** 로봇 테스트를 시작합니다. ***");
        robot.turnOn();
        robot.moveForward();
        robot.moveBackward();
        robot.turnOff();
        System.out.println("*** 테스트 완료 ***");
    }

    //전투 기능 테스트
    public void testRobotAttack(Attackable robot) {
        robot.attack();
    }

    //요리 기능 테스트
    public void testRobotCook(Cookable robot){
        robot.cook("라면");
    }

    public static void main(String[] args) {
        RobotOperator operator = new RobotOperator();

        operator.testRobot(new BattleBot()); //전투로봇

        operator.testRobot(new ChefBot()); //요리로봇

        //나중에 청소 로봇이 추가된다고 해도 testRobot이 메서드는 고칠 필요가 없습니다.
        operator.testRobotAttack(new BattleBot());

        operator.testRobotCook(new ChefBot());

        Controllable[] arr = {new BattleBot(), new ChefBot()};
    }

}
