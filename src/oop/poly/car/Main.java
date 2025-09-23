package oop.poly.car;

import oop.static_.utils.PrintUtil;

import static oop.static_.utils.PrintUtil.*;

public class Main {
    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        Sonata[] sonatas = {s1, s2, s3};
//        for(Sonata s: sonatas){
//            s.run();
//        }
        // 다형성을 적용해서 서로 다른 타입 객체를 모아놓을 수 있다. (이종 모음 배열)
        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car c: cars){
            c.run();
        }

        printLine();

        Driver kim = new Driver();
        kim.drive(t3);
        kim.drive(p2);
        kim.drive(s1);

        printLine();

        /*
		 - 다형성이 적용되면 자식 클래스의
		  본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		  (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)

		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
        Car myTesla = kim.buyCar("테슬라");
        myTesla.run();
        Tesla t5 = (Tesla) myTesla;
        t5.activeAutoPilot();

        System.out.println(myTesla);
        System.out.println(t5);

        printLine();

        CarShop carShop = new CarShop();
        carShop.carPrice(p2);
        carShop.carPrice(s1);
        carShop.carPrice(t4);
    }
}
