package oop.poly.player;

public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");

        Mage m1 = new Mage("법사1");
        Mage m2 = new Mage("법사2");

        Hunter h1 = new Hunter("냥꾼1", "멍멍이");
        Hunter h2 = new Hunter("냥꾼2", "야옹이");


        m1.blizzard(w1, w2, m2, h1, h2);
    }
}
