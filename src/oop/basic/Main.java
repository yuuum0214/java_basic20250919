package oop.basic;

public class Main {
    public static void main(String[] args) {

        /*
        설계도에 작성된 속성과 기능을 사용하려면
        반드시 실체(객체)가 있어야 한다
        설계도만으로는 아무것도 할 수 없다.
         */

        //새로운 new 객체명 ();
        //지금 이 객체 자체에는 주소값이 들어가있음!
        Pen redPen = new Pen();
        Pen bluePen = new Pen();

        //객체로 접근한 후 속성과 기능을 사용해보자
        //변수에 있는 주소값으로 객체에 접근한다
        //참조연산자 . : redPen. -> redPen을 참조(.) 하겠다!
        redPen.price = 500;
        redPen.color = "빨강";
        redPen.penNo = "a001";

        bluePen.price = 600;
        bluePen.color = "파랑";
        bluePen.penNo = "a002";

        redPen.write();
        bluePen.write();

        redPen.penInfo();
        bluePen.penInfo();
    }
}
