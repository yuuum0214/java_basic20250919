package oop.modi.protec.pac1;

public class A {

    protected int f1;
    int f2; //default, pacage-friendly

    public A() {}
    protected A(int a) {}
    A(String b) {}

    protected void m1() {}
    void m2() {}

    void test() {
        f1 = 10;
        f2 = 10;

        m1();
        m2();
        new A();
        new A(10);
        new A("asdasd");
    }
}
