package oop.static_.field;

public class Main {
    public static void main(String[] args) {

        Count c1 = new Count();

        c1.a += 5;
        c1.b += 5;

        System.out.println("c1.a = " + c1.a);
        System.out.println("c1.b = " + c1.b);

        System.out.println("____________________________________");

        Count c2 = new Count();

        c2.a += 7;
        c2.b += 7;

        System.out.println("c2.a = " + c2.a);
        System.out.println("c2.b = " + c2.b);

        System.out.println("____________________________________");

        Count c3 = new Count();

        c3.a += 8;
        c3.b += 8;

        System.out.println("c3.a = " + c3.a);
        System.out.println("c3.b = " + c3.b);
        System.out.println("c1.b = " + c1.b);
        System.out.println("c2.b = " + c2.b);

        /*
         - static이 붙은 데이터는 그 static 데이터가 선언된
          클래스의 이름으로 바로 참조할 수 있습니다.
         - 일반 멤버변수(필드)와 혼동할 가능성이 있기 때문에
          주소값으로 접근하지 않습니다.
         */

        Count.b++;
        System.out.println("Count.b = " + Count.b);

        System.out.println("____________________________________");
//        static은 굳이 이런 정의를 할 필요가 없음.
//        oop.static_.method.Count sm = new oop.static_.method.Count();
//        sm.m1();

        oop.static_.method.Count.m2();

    }
}
