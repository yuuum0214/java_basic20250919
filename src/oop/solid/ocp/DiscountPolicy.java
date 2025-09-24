package oop.solid.ocp;

//할인 정책이라면 가격을 받아 할인된 금액을 알려준다는 규칙!
public interface DiscountPolicy {

    long getDiscountPrice (long price);
}
