package oop.inter;

//전투 로봇은 Controllable이라는 규칙을 따르겠다!
//전투 로봇은 Attackable 규칙도 따르겠다! (다중 구현)
public class BattleBot implements Controllable, Attackable {

    @Override
    public void turnOn() {
        System.out.println("BattleBot turned on! 눈에서 붉은 빛이 번쩍입니다!");
    }

    @Override
    public void turnOff() {
        System.out.println("BattleBot turned off!");
    }

    @Override
    public void moveForward() {
        System.out.println("전투 로봇이 씩씩하게 앞으로 전진합니다!");
    }

    @Override
    public void moveBackward() {
        System.out.println("전투로봇이 내 뒤로 물러납니다.");
    }

    @Override
    public void attack() {
        System.out.println("레이저 빔 발사!!!");
    }

    @Override
    public void parentMethod() {

    }
}
