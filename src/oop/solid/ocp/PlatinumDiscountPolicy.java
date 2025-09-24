package oop.solid.ocp;

public class PlatinumDiscountPolicy implements DiscountPolicy{
    @Override
    public long getDiscountPrice(long price) {
        return price * 30 / 100;
    }
}
