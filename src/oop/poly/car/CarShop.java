package oop.poly.car;

public class CarShop {
    /*
            Mammals
               |
             Person
               |
            Student

            Mammals m = new Student();
            m instanceof Person -> true
         */
    public void carPrice (Car c) {
        // instanceof 기준 좌우를 나눠서, 좌항 개체가 우항 개체를 가질 수 있는가?
        // 가능하면 true, 불가능하면 false
        if(c instanceof Sonata) {
            System.out.println("쏘나타의 가격은 3000만원 입니다.");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 7000만원 입니다.");
        } else {
            System.out.println("포르쉐의 가격은 1.5억원 입니다.");
        }
    }

}
