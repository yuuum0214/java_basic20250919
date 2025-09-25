package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.List;

import static etc.stream.Menu.*;

public class Filtering {
    public static void main(String[] args) {

        List<Dish> dishList = MENU_LIST.stream()
                .filter(Dish::isVegetarian) // d -> d.isVegetarian()
                .toList();

        dishList.forEach(System.out::println);

//        for(Dish dish : dishList){
//            System.out.println(dish);

        PrintUtil.printLine();

        //메뉴 목룍 중에 육류이면서 600칼로리 미만인 요리를 필터링 해서 출력

        MENU_LIST.stream()
                .filter(d->d.getType() == Dish.Type.MEAT
                        && d.getCalories() < 600)
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        //메뉴 목록에서 요리 이름이  4글자인 것만 필터링해서 출력해줘.
        MENU_LIST.stream()
                .filter(dish->dish.getName().length() == 4)
                .toList()
                .forEach(System.out::println); // d -> System.out.println(d) 이런 느낌..

        PrintUtil.printLine();

        //칼로리가 300칼로리보다 큰 요리중에 앞에 3개만 가져와.
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) //앞에서부터 3개만 추출
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();
        //칼로리가 300칼로리보다 큰 요리 중 처음 2개 빼고 나머지를 가져와
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .toList()
                .forEach(d-> System.out.println(d));

        PrintUtil.printLine();
        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 4, 5, 6);
        //리스트에서 짝수만 필터링. (중복 제거)
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList()
                .forEach(System.out::println);



    }
}



