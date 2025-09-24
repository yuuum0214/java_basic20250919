package oop.solid.lsp;

public class Square implements Shape{

    private int sideLength; //정사각형은 한 변의 길이만 있으면 OK!

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}
