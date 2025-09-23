package oop.final_.field;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수");

        //        kim.nation = "미국"; 불가능!
//        kim.name = "김마이클";  불가!
        kim.age = 100;
        System.out.println(kim.name);

        Person park = new Person("박영희");
//        park.nation = "영국"; 불가!! 못 바꿈!!



    }
}
