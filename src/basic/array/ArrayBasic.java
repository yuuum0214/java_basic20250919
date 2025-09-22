package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] numbers;

        //2. 배열 객체 생성
        numbers = new int[5];

        //3. 배열 내부 초기화
        //인덱스를 지목해서 데이터 할당
        //인덱스는 0부터 시작.
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14;
        numbers[3] = numbers[0] + 20;
//        numbers[4] = "메롱"; (X)
        numbers[4] = 100;
//        numbers[5] = 10; (X) -> 빨간 줄이 안 뜸. 하지만 배열크기 넘어가서 에러남

        //4. 배열의 길이
        System.out.println("배열 길이 : " + numbers.length);

        //5. 배열의 순회
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("___________________________________");

        //배열의 순회 forEach (향상된 for문)
        for (int n : numbers){
            System.out.println(n);
        }

        //배열 내부를 문자열 형태로 한 번에 출력하기
        System.out.println(Arrays.toString(numbers));

        //배열 쉽게 초기화하기
        //선언 당시 크기 고정. 이후 변하지 않음
        //크기를 늘리거나 줄이고싶다면 새로운 배열을 만들어 값을 옮겨야 함.
        int[] pointList = {10, 20, 30, 40};
        String[] pets = {"고양이", "강아지", "병아리", "햄스터", "기니피그"};
        pets[2] = "닭";
    }
}
