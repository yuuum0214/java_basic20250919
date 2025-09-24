package oop.poly.player;

import java.util.Objects;

import static oop.static_.utils.PrintUtil.printLine;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
    }

    /*
    사냥꾼의 고유 기술인 magicArrow()를 완성해 주세요.
    타겟은 단일 타겟이고, 어떤 직업이든 매직 **우를 맞출 수 있습니다.

    각 직업별로 데미지가 다르게 들어갑니다.
    전사는 10, 마법사는 20, 사냥꾼은 15
    타겟의 직업이 무엇이냐에 따라 각각 다른 데미지를 적용해 주세요.
    %s가 %d의 피해를 입었고, 남은 체력은 얼마다 라는 정보도 출력해 주시고
    Main 클래스에서 메서드를 호출해 보세요.
     */

    public void magicArrow(Player p) {
        System.out.printf("\n%s님이 %s님에게 매직애로우 시전!!\n", this.nickname, p.nickname);
        printLine();

        if (p == this) return;
        int damage;
        String job;

        if (p instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (p instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else {
            damage = 15;
            job = "사냥꾼";
        }

        p.hp -= damage;
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다. (남은 체력: %d) \n"
                , p.nickname, job, damage, p.hp);
        printLine();


//        switch (p.nickname) {
//            case "전사1", "전사2":
//                damage = 10;
//                p.hp -= damage;
//                System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d) \n"
//                        , p.nickname, damage, p.hp);
//                break;
//            case "법사1", "법사2":
//                damage = 20;
//                p.hp -= damage;
//                System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d) \n"
//                        , p.nickname, damage, p.hp);
//                break;
//            case "냥꾼1", "냥꾼2":
//                damage = 15;
//                p.hp -= damage;
//                System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d) \n"
//                        , p.nickname, damage, p.hp);
//        }

    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("pet = " + pet);
    }
}
