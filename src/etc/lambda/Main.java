package etc.lambda;

import oop.static_.utils.PrintUtil;

import java.util.List;
import java.util.logging.Filter;

import static etc.lambda.Color.*;

public class Main {
    public static void main(String[] args) {

        // 사과 바구니 생성
        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과만 필터링 ==========");
        List<Apple> greenApples = FilterApple.filterGreenApple(appleBasket);
        for(Apple greenApple : greenApples){
            System.out.println(greenApple);
        }

        System.out.println("========== 원하는 조건의 사과만 필터링 ==========");
        List<Apple> redApples = FilterApple.filterAppleByColor(appleBasket, RED);
        for (Apple redApple : redApples) {
            System.out.println(redApple);
        }

        PrintUtil.printLine();

        List<Apple> lightApple
                = FilterApple.filterApple(appleBasket, new LightApplePredicate());

        //반복문을 통한 필터링
        for (Apple apple : lightApple){
            System.out.println(apple);
        }

        PrintUtil.printLine();
        //빨강 또는 노랑 사과만 필터링
        //클래스를 또 만들긴 너무 귀찮다...
        //메서드 호출할 때, 이름 없는 클래스를 즉석으로 만들어 보내면 안되나? -> 오, 익명 클래스?
        List<Apple> apples = FilterApple.filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        for (Apple apple : apples){
            System.out.println(apple);
        }

        PrintUtil.printLine();

        //녹색이면서 100g 이하인 사과만 필터링
        // 우리는 이제 익명클래스를 통해 새 클래스 파일 생성 없이 즉석으로 보낼 수 있음
        // 근데 생각해보니 어차피 인터페이스에 추상메서드 하나뿐이잖아
        // 그럼 이름 언급할 필요가 있나? -> 람다식을 쓰자!!

        List<Apple> apples2 = FilterApple.filterApple(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeight() <= 100);

        for(Apple apple : apples2){
            System.out.println(apple);
        }

        PrintUtil.printLine();
        //색깔이 빨강 혹은 초록이면서, 무게는 150g 미만이어야 한다.
        // 논리 연산에서 and가 or보다 우선.
        List<Apple> aplles3 = FilterApple.filterApple(appleBasket,
                (apple) -> (apple.getColor() == RED
                                || apple.getColor() == GREEN)
                                && apple.getWeight() < 150);

        for(Apple apple : aplles3){
            System.out.println(apple);
        }

        PrintUtil.printLine();
        //여러가지 타입의 객체를 필터링
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter1 = FilterApple.filter(numbers, n-> n % 2 == 0);
        System.out.println(filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살", "파스타");
        //글자수 3개인것만 가져오기
        List<String> filter2 = FilterApple.filter(foods, f-> f.length() == 3);
        System.out.println(filter2);

        PrintUtil.printLine();
        //이번에는 사과의 색상만 싹 뽑아서 리스트로 받아보고 싶어요.
        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        PrintUtil.printLine();
        //그럼 이번엔 사과의 무게만 뽑아봐
        // 내가 나중엔 사과 리스트 말고 다른 리스트도 줄 수 있어!
        List<Integer> map1 =  MappingApple.map(appleBasket, new GenericFunction<Apple, Integer>() {
            @Override
            public Integer apply(Apple apple) {
                return apple.getWeight();
            }
        });
        System.out.println("map1 = " + map1);

        PrintUtil.printLine();
        //숫자 리스트를 주면 제곱된 수를 가져와.
        // n이 전달이 되면 리턴하겠따, n의 제곱을!
        List<Integer> map2 = MappingApple.map(numbers, n -> (int) Math.pow(n, 3));
        System.out.println("map2 = " + map2);

        PrintUtil.printLine();
        // 음식 리스트를 주면 첫글자만 뽑아와 => CharAt(0)도 가능!
        List<String> map3 = MappingApple.map(foods, f -> f.substring(0, 1));
        System.out.println("map3 = " + map3);

    }
}
