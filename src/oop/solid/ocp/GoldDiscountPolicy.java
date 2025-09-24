package oop.solid.ocp;

public class GoldDiscountPolicy implements DiscountPolicy{

    @Override
    public long getDiscountPrice(long price) {
        return  price * 10 / 100;
    }
}
