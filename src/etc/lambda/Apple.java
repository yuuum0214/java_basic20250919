package etc.lambda;

import java.util.Objects;

public class Apple {

    private int weight;
    private Color color;

    public Apple() {}

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Apple apple)) return false;
        return weight == apple.weight && color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
