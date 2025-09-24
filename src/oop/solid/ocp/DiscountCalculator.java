package oop.solid.ocp;

public class DiscountCalculator {

    public long calculateDiscount(DiscountPolicy policy, long price) {
        //계산기는 그저 전달받은 정책에 따라 계산만 함
        return policy.getDiscountPrice(price);
    }

}
