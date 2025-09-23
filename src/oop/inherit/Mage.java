package oop.inherit;

public class Mage extends Player {

    int mana;

    public Mage(String nickname, int mana) {
        super(nickname);
        this.mana = mana;
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana = " + mana);
    }
}
