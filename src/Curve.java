public class Curve extends Object {
    private double width;

    public Curve(String color, double width) {
        super(color);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("%s curve with width of %.2f.\n", getColor(), width);
    }
}
