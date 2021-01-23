package cards;

public class SetCard {
    private String shape;
    private int number;
    private String shading;
    private String color;

    public SetCard(String shape, int number, String shading, String color) {
        this.shape = shape;
        this.number = number;
        this.shading = shading;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public int getNumber() {
        return number;
    }

    public String getShading() {
        return shading;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SetCard{" +
                "shape='" + shape + '\'' +
                ", number=" + number +
                ", shading='" + shading + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
