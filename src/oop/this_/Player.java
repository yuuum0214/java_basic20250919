package oop.this_;

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

    void characterInfo(){
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("nickname = " + nickname);
        System.out.println("level = " + level);
        System.out.println("hp = " + hp);

    }

}
