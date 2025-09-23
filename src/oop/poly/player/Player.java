package oop.poly.player;

/*
	# 부모 클래스, 상위 클래스 (Parent, super class)

	- 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
	- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
	 멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/

public class Player {

    //필드
    String nickname;
    int level;
    int hp;

    public Player() {
        System.out.println("기본 생성자 호출!");
        level = 1;
        hp = 50;

    }

    public Player(String nickname) {
        this(); //같은 클래스 내의 다른 생성자를 호출하는 문법
        System.out.println("2번 생성자 호출!");
        this.nickname = nickname;
    }

    public Player(String nickname, int hp) {
        this(nickname);
        System.out.println("3번 생성자 호출!");
        this.hp = hp;
    }

    // 일반 메서드
    void attack(Player target){
        if(target == this){
            System.out.println("타겟이 잘못되었습니다!");
            return;
        }

        System.out.printf("%s님이 %s님을 공격합니다!\n", this.nickname, target.nickname);

        //맞는 Player의 체력을 10 감소시키고, 때리는 Player의 체력은 3 감소시키자.
        target.hp -= 10;
        this.hp -= 3;

        System.out.printf("%s님의 남은 체력: %d\n", this.nickname, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickname, target.hp);
    }

    void characterInfo(){
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("nickname = " + nickname);
        System.out.println("level = " + level);
        System.out.println("hp = " + hp);

    }
}
