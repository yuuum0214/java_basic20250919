package oop.overloading;

public class Calculator {

    //오버 로딩 -> 중복선언 -> 생성자도 가능하고 메서드도 가능한 문법
    // 매개변수로 오버로딩을 조정 -> 개수, 순서, 데이터 타입 세 가지 중 하나만 다르게 하더라도 오버로딩 인정.

    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }

    void method1() {}
    void method1(int i) {}
    void method1(String s) {}
    void method1(int i, double d) {}
    void method1(double d, int i) {}

    int calcArea(int h){
        return h*h / 2;
    }

    int calcArea(int w, int h){
        return w * h;
    }

    // 리턴타입은 오버로딩과 연관없음! 매개변수로만 가능!
    double calcArea(int f, int c, int h){
        return (double) ( f + c ) * h / 2;
    }

}
