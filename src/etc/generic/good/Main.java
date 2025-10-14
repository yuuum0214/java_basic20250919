package etc.generic.good;

import java.util.List;

//Calculator에 들어갈 제네릭 타입은 Number나 Number를 상속받은 자식 클래스만 가능하다.
class Calculator<T extends Number> {
    //Number : java lang 패키지에서 기본 제공되는 것
    
    private T number;
    
    public Calculator(T number){
        this.number = number;
    }
    
    public void calcDouble(){
        System.out.println(number.doubleValue()); //Number가 물려준 메서드 호출 가능
    }
}

public class Main {

    //리턴타입 앞에 <T>를 작성해야 제네릭 메서드로 인식됩니다!
    public static <T> void printArray(T[] inputArray){
        for(T t : inputArray){
            System.out.println(t);
        }
    }

    // 와일드 카드 표기법
    // 1. Upper Bounded Wildcard (상한 제한)
    // 전달되는 매개값에 제네릭 타입을 제한하고 싶을 때 사용
    // 전달된 리스트에는 새로운 요소 추가는 불가합니다. (타입을 알 수 없어서?)
    public static double sumOfList(List<? extends  Number> list) {
        double sum = 0.0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    // 2. Lower Bounded Wildcard (하한 제한)
    // Integer이거나, Integer의 부모 (Number, Object)의 리스트만 받을 수 있음
    // 새로운 요소 추가 가능
    public static void addNumbersToList(List<? super Integer> list, int count){
        for(int i=0; i<count; i++){
            list.add(i+1);
        }
    }

    // 3. Unbounded Wildcard (제한 없음)
    // 어떤 타입이든 모든 타입의 리스트를 받을 수 있음 -> Object로 처리됨에 주의!
    // 새로운 요소 추가 불가! (타입을 알 수 없음)
    public static void printList(List<?> list) {
        for (Object o : list){
            System.out.println(o);
        }
    }


    public static void main(String[] args) {

        Box<String> box =  new Box<>();
        box.setObj("김춘식");
        int length = box.getObj().length();

        Box<Person> pbox = new Box<>();
        pbox.setObj(new Person());
        String name = pbox.getObj().getName();
    }
}
