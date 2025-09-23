package oop.poly.player;

public class Hunter extends  Player {

    String pet;

    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("pet = " + pet);
    }
}
