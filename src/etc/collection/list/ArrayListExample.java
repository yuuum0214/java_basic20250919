package etc.collection.list;

import oop.static_.utils.PrintUtil;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

//        String[] arr = new String[50];

//        <> -> 제네릭 ( 타입의 형식을 지정해 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        // add(객체) : 리스트에 객체를 추가하는 메서드
        nick.add("멍멍이");
        String str = "야옹이";
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add("짹짹이");
        nick.add("야옹이");

        System.out.println("nick = " + nick);

        //add(인덱스, 객체) : 원하는 위치에 객체 삽입
        nick.add(3, "어흥이");
        System.out.println("nick = " + nick);

        // get(인덱스) : 리스트 내부의 객체를 참조
//        String str = nick[3];
        String name = nick.get(3);
        System.out.println("name = " + name);
        System.out.println("nick의 크기 = " + nick.size());

        //set(인덱스, 수정할 객체) : 리스트 내부의 객체 수정
        nick.set(2, "삐약이");
        System.out.println("nick = " + nick);

        // 리스트 반복문 처리
        for(int i =0; i<nick.size(); i++){
            System.out.println(nick.get(i));
        }

        PrintUtil.printLine();

        for (String s : nick) {
            System.out.println(s);
        }

        // contains (객체) : 리스트 내의 객체의 존재 유무를 파악
        System.out.println(nick.contains("거북이"));

//        indexof (객체) : 특정 객체의 인덱스 탐색, 없다면 -1 리터
        int idx = nick.indexOf("짹짹이");
        System.out.println("idx = " + idx);
        
        //remove(객체 or 인덱스) : 리스트 내부 객체 삭제
        nick.remove("삐약이");
        nick.remove(0);
        System.out.println("nick = " + nick);

        // clear() : 리스트 내부 요소 전체 삭제
        nick.clear();
        System.out.println("nick = " + nick);
        
        // isEmpty() : 리스트가 비어있는지의 여부 확인
        System.out.println(nick.isEmpty());

        PrintUtil.printLine();

        /*
        # 컬렉션 객체들은 Colletions의 기능을 사용할 수 있음
        Collections는 컬렉션 객체들의 부가 기능들을 제공합니다.
         */

        List<Integer> score = new ArrayList<>();
        score.add(90);

        /*
        Collections.addAll : 이미 만들어진 컬렉션에 여러 요소를 추가하는 메서드

        Arrays.asList : add, remove 불가. set()으로 요소 변경은 가능. null 요소 허용
        List.of : add, remove, set 불가. null요소 불허. (java 9버전)
         */
        List<Integer> integerList = List.of(1, 2, 3, 4 ,5 ,6 ,7, 8, 9);
        List<Integer> integerList1 = Arrays.asList(1, 2 ,3,4,5,6,7,8,9);
        Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);


        System.out.println(score);

        //컬렉션 내의 객체의 개수 구하기
        System.out.println("100점 학생 수: " + Collections.frequency(score, 100));
        System.out.println("최댓값: " + Collections.max(score));
        System.out.println("최솟값: " + Collections.min(score));

        //정렬 (오름차)
        Collections.sort(score);
        System.out.println("score = " + score);
//        Collections.reverse(score); // 단순 역순배치 (정렬X)
        Collections.sort(score, Collections.reverseOrder()); // 내림차 정렬
        System.out.println("score = " + score);
        
        // 여기서부터는 그냥 알고만있어도 됨
        // 두 요소의 위치를 교체 swap(리스트, i, j)
        Collections.swap(score, 3, 7);
        System.out.println("score = " + score);
        
        //리스트 내의 요소를 무작위로 섞기
        Collections.shuffle(score);
        System.out.println("score = " + score);
        
        //원하는 객체로 컬렉션 전부 조기화
        Collections.fill(score, 100);
        System.out.println("score = " + score);

    }

}
