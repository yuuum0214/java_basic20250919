package oop.fieldlocal;

public class Person {
    //함수는 자판기 같은 것! 값을 돌려줄 수 있음.
    String name;
    int age;

    // 매개변수 (Parameter) -> 메서드를 호출할 때 전달해야 하는 값
    String hello(String country){
        int i = 30; //지역변수
        System.out.println("i의 값: " + i);

        System.out.println((name + "이(가) 인사를 합니다."));
        if(country.equals("한국")){
            return "안녕하세요!";
        } else if (country.equals("미국")){
            return "Hello~!";
        } else if (country.equals("일본")){
            return "곤니치와~~";
        } else {
            //리턴 타입을 String이라고 작성했으면
            //어떤 상황에서도 이 메서드는 문자열을 리턴해야 함
            return "그 나라 인사는 모르겠는데요...";
        }
    }

}
