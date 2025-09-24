package oop.inter;

public class ChefBot implements Controllable, Cookable {
    @Override
    public void turnOn() {
        System.out.println("요리사 로봇 가동! 오늘의 메뉴를 추천해드릴까요?");
    }

    @Override
    public void turnOff() {
        System.out.println("요리사 로봇이 주방을 정리하고 꺼집니다.");
    }

    @Override
    public void moveForward() {
        System.out.println("요리사 로봇이 부드럽게 앞으로 이동합니다.");
    }

    @Override
    public void moveBackward() {
        System.out.println("요리사 로봇이 조심스럽게 뒤로 이동합니다.");
    }

    @Override
    public void cook(String menu) {
        System.out.println(menu + "요리를 시작할게요. 보글보글~~");
    }

    @Override
    public void parentMethod() {

    }
}
