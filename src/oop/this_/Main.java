package oop.this_;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("플레이어1");
        p1.characterInfo();

        System.out.println("___________________");
        Player p2 = new Player("플레이어2" , 200);
        p2.characterInfo();
    }
}
