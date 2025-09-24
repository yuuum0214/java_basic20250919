package oop.solid.ocp;

public class SilverDiscountPolicy implements DiscountPolicy{
    @Override
    public long getDiscountPrice(long price) {
        return price * 5/100;
    }
}
