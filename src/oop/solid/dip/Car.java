package oop.solid.dip;

public class Car {

    private Tire frontLeft;
    private Tire frontRight;
    private Tire backLeft;
    private Tire backRight;

    public Car(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    public void drive() {
        frontLeft.roll();
        frontRight.roll();
        backLeft.roll();
        backRight.roll();
    }

}
