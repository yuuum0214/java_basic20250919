package etc.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import oop.static_.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

public class Mapping {
    public static void main(String[] args) {

        //요리 이름만 출력
        // .toList() : 자바 16부터 사용 가능, 데이터 변경 할 일 없을 때 사용
        // collect(Collectors.toList()) : 자바 8부터 존재하던 방식. 수정이 자유로움.
        List<String> nameList = MENU_LIST.stream()
                .map(Dish::getName) // d->d.getName()
                .collect(Collectors.toList());
//                .toList(); //불변리스트 제공

        nameList.add("pasta");
        System.out.println("nameList = " + nameList);

        PrintUtil.printLine();

        List<String> browser = List.of("safari", "chrome", "ma edge", "firefox", "opera");

        //문자열의 길이만 추출
        List<Integer> list = browser.stream()
                .map(b -> b.length()) //String::length -> String의 length에 일괄적용
                .toList();
        System.out.println("list = " + list);

        //문자열 앞글자
        List<Character> list2 = browser.stream()
                .map(b -> b.charAt(0))
                .toList();
        System.out.println("list2 = " + list2);

        PrintUtil.printLine();

        //메뉴 목록에서 메뉴 이름과 칼로리만 추출해서,
        // 새로운 객체를 포장해서 받고싶다.
        List<SimpleDish> simpleDishes = MENU_LIST.stream()
                .map(SimpleDish::new) // d->new SimpleDish(d)
                .toList();
        simpleDishes.forEach(System.out::println);

        PrintUtil.printLine();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
        MENU_LIST.stream()
                .filter(d -> d.getCalories() > 500)
                .map(d -> new DishDetail(d))
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 메뉴 목록에 있는 요리들의 총 칼로리 구하기 : mapping으로 칼로리만 가져와서 더하기
        int sum = MENU_LIST.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sum = " + sum);

        //육류 메뉴의 평균 칼로리 구하기
        double meatAvgCal = MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.printf("meatAvgCal = %.2f\n", meatAvgCal);

        PrintUtil.printLine();

        //모든 요리 이름에 포함된 알파벳을 중복 없이 추뤃
        //flatMap : map처럼 변환을 하긴 하는데, 그 결과는 반드시 stream이어야 한다.
        //여러 개의 스트림을 단일 스트림으로 합쳐줌
        List<String> stringList = MENU_LIST.stream()
                .map(d -> d.getName().split(""))
                .flatMap(arr -> Arrays.stream(arr))
                .filter(s->!s.isBlank()) //공백이면 true, !true는 곧 false.
                .distinct()
                .toList();
        System.out.println("stringList = " + stringList);

        PrintUtil.printLine();

        //Peek(I) : 스트림의 중간 과정 확인하기
        List<String> StringList1 = MENU_LIST.stream()
                .filter(d -> d.getCalories() > 300)
                .peek(d-> System.out.println("필터링 후 : " +d.getName()))
                .map(d -> d.getName())
                .peek(System.out::println)
                .limit(3)
                .toList();

        System.out.println("StringList1 = " + StringList1);



    }
}
