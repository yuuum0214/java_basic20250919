package oop.solid.dip;

public class Main {
    public static void main(String[] args) {

        Car car = new Car (
          new HankookTire(), new HankookTire(), new MichelinTire(), new MichelinTire()
        );

    }
}
