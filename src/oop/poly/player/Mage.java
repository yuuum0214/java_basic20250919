package oop.poly.player;

import oop.static_.utils.PrintUtil;

import static oop.static_.utils.PrintUtil.*;

public class Mage extends Player {

    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 100;
    }

    // 가변 인수 적용
    // 콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 메서드 내부로 전달합니다.
    public void blizzard(Player... targets) {
        System.out.printf("%s님이 눈보라를 시전!!\n", this.nickname);
        this.mana -= 30;
        System.out.printf("30의 마나가 소모됩니다. 남은 정신력: %d\n", this.mana);
        printLine();
        for (Player p : targets) {
            if (p == this) continue;
            int damage = (int) (Math.random() * 6 + 10); // 10~15 사이 난수 발생.
            p.hp -= damage;
            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d) \n"
                    , p.nickname, damage, p.hp);
        }
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana = " + mana);
    }
}
