package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {

    //protected는 다른 패키지의 접근을 허용하지 않음. (default랑 비슷)
    //상속 관계가 있다면 부분적으로 생성자 내부 접근 허용
    C() {
        this.m1();
//        this.m2(); -> default
        this.f1 = 10;
//        this.f2 = 20; -> default
        //부모와 같은 것은 일시 허용, 일반 메서드에서는 접근 제한
        //protected는 상속을 유도하고 싶을 때 사용. 그러나 객체 생성시에만 허용하는 형식임.
    }
    void test() {
        A a = new A();

//        a.f1 = 10;
//        a.f2 = 20;
//        a,m1();
    }


}
