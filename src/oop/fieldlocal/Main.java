package oop.fieldlocal;

public class Main {
    public static void main(String[] args) {
        //객체는 설계도(클래스) 만으로 아무것도 못함
        //객체를 생성해야함

        Person kim = new Person();
        Person lee = new Person();
        Person park = new Person();

        kim.name = "김철수";
        kim.age = 30;
        //메서드를 호출했을 때 리턴값이 있다면 메서드를 호출한 곳으로 리턴됩니다
        //그 리턴된 값은 변수에 할당할 수도 있고, 바로 출력하는 것도 가능합니다.
        String hello = kim.hello("한국");
//        System.out.println("kim.i = " + kim.i); 지역 변수는 해당 지역 외에서는 지목할 수 없습니다.
        System.out.println("hello = " + hello);

        System.out.println(hello.equals("안녕하세요!")); // true? ok

        String s = new String("안녕하세요!");
        System.out.println(s.equals(hello));
    }
}
