package oop.static_.singleton;

public class Main {
    public static void main(String[] args) {

//        new Singleton(); ->private라 사용 못함
        Singleton s1 = Singleton.getInstance();
        s1.method1();
        s1.method2();

        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
