package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.*;

public class Finding {
    public static void main(String[] args) {

        //메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재 하는가?
        boolean flag1= MENU_LIST.stream()
                .filter(d->d.getCalories() > 500)
                .anyMatch(d->d.isVegetarian()); //뭐라도 있으면 true, 없으면 false
        System.out.println("flag1 = " + flag1);

        //메뉴 목록 중 칼로리가 100 이하인 요리가 하나라도 존재하는가?
        boolean flag2 = MENU_LIST.stream()
                .anyMatch(d->d.getCalories() <= 100);
        System.out.println("flag2 = " + flag2);

        //음식 메뉴 중에 모든 요리가 1000칼로리 미만인가요?
        boolean flag3 = MENU_LIST.stream()
                .allMatch(d->d.getCalories() < 1000); //전부 일치
        System.out.println("flag3 = " + flag3);

        //음식 메뉴 중에 모든 요리가 1000칼로리 미만이 아닌가요?
        boolean flag4 = MENU_LIST.stream()
                .noneMatch(d->d.getCalories() > 1000); //전부 불일치
        System.out.println("flag4 = " + flag4);

        //음식 중에 칼로리가 제일 낮은 얘가 누구에요?
        Dish dish = MENU_LIST.stream()
                .min(Comparator.comparing(d->d.getCalories()))
                .get();
        System.out.println("dish = " + dish);



    }
}
