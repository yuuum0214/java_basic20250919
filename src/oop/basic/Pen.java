package oop.basic;

//객체 설계용 클래스에는 메인 함수를 작성하지 않습니다.
public class Pen {

    //객체의 속성을 표현 -> 필드(멤버변수)라고 부름
    int price; //가격
    String color; //색상
    String penNo; //펜 넘버

    //객체의 기능을 표현한 함수 -> 메서드(Method)라고 부름 : 객체가 동작하는 방식
    //함수는 동작을 실행하고 실행 결과값을 돌려줄 수 있는 기능이 있으며
    //함수 이름앞에 돌려주교 타입을 작성하는데 돌려줄 값이 없다면 void 라고 작성

    //1. 함수의 이름을 정함 : 이름() {바디}
    void write(){
        System.out.println(color + "색 글을 씁니다." );
    }

    void penInfo(){
        System.out.println("제품 번호: " + penNo);
        System.out.println(color + "색 펜의 가격은" + price + "원 입니다.");
    }


}
