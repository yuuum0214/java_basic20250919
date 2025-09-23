package oop.encap.bad;

public class MyBirth {
    
    int year;
    int month;
    int day;
    
    void birthInfo(){
        //형식 지정 표준 출력 함수 printf();
        //서식 문자를 이용해서 문자열을 조립하고, 서식 문자에 들어갈 값을 나중에 포맷팅
        // %d -> 정수, %f -> 실수, %s -> 문자열
        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.",
                this.year, this.month, this.day);
    }
}
