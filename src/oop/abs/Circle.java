package oop.abs;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        // 부모의 생성자가 특정 매개값을 받는 생성자 밖에 없다면
        // 자식 생성자에서도 반드시 특정 매개값을 전달하는 super()를 호출해야 함
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
